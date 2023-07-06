package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<IModelChangedObserver> changedObservers) {
        this.changedObservers = changedObservers;
        models = new ArrayList<>();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }

    public Scene GetScena(int id){
        return new Scene(id, models, flashes);
    }

}
