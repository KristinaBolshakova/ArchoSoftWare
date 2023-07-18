package BuyTicket.Core;

import BuyTicket.ClientApplication.Authentication;
import BuyTicket.Interfaces.ICarrierRepo;
import BuyTicket.Interfaces.ICashRepo;
import BuyTicket.Models.Carrier;
import BuyTicket.Models.Ticket;
import BuyTicket.Models.User;
import BuyTicket.Services.CarrierRepository;
import BuyTicket.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider implements ICarrierRepo, ICashRepo {
    private long cardNumber;
    private boolean isAuthorized;
    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    @Override
    public Carrier read(int id) {
        return null;
    }

    @Override
    public boolean transaction(int payment, long cardFrom, long cardTo) {
        return false;
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client - клиент
     */
    public void authorization(User client) {
        try {
            Authentication.authentication(new Customer().getUserProvider(), client.getUserName(), client.getHashPassword());
            isAuthorized = true;
        } catch (RuntimeException e) {
            isAuthorized = false;
        }
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) throws RuntimeException {
        Carrier carrier = carrierRepository.read(1);
        return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }


    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
