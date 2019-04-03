import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {
    private HashMap<RegistrationPlate,String> vehicleRegisterList;

    public VehicleRegister(){
        this.vehicleRegisterList = new HashMap<RegistrationPlate,String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if (this.vehicleRegisterList.containsKey(plate)) return false;
        this.vehicleRegisterList.put(plate,owner);
        return true;
    }

    public String get(RegistrationPlate plate){
        return this.vehicleRegisterList.get(plate);
    }

    public boolean delete(RegistrationPlate plate){
        if (this.vehicleRegisterList.containsKey(plate)) {
            this.vehicleRegisterList.remove(plate);
            return true;
        }
        else return false;
    }

    public void printRegistrationPlates(){
        Set<RegistrationPlate> plates = this.vehicleRegisterList.keySet();
        for (RegistrationPlate plate :
                plates) {
            System.out.println(plate);
        }
    }

    public void printOwners(){
        Set<String> owners = new HashSet<String>(this.vehicleRegisterList.values());
        for (String owner :
                owners) {
            System.out.println(owner);
        }
    }
}
