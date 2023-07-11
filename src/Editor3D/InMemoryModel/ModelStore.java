package Editor3D.InMemoryModel;

import Editor3D.ModelElements.Camera;
import Editor3D.ModelElements.Flash;
import Editor3D.ModelElements.PoligonalModel;
import Editor3D.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangedObserver> changedObservers;

    /**
     *
     * @param texture
     * @throws Exception
     */

    public ModelStore(List<iModelChangedObserver> changedObservers) throws Exception {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    /**
     * Регистрация изменений
     *
     * @param sender
     */

    @Override
    public void NotifyChange(IModelChanger sender) {

    }

    /**
     * Возвращает scena по id
     *
     * @param id
     * @return
     */

    public Scene GetScena(int id) {
        for (int i = 0; i < scenes.size(); i++)
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        return null;
    }


}
