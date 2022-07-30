package de.tum.in.ase.eist;

//TODO implement SearchInterface
public class PermissionChecker {
    public boolean isPermitted(Rider rider, PEV pev){
        if(pev.getClass().getSimpleName()==EBike.class.getSimpleName()){
            return true;
        } else if(pev.getClass().getSimpleName()==EKickscooter.class.getSimpleName()&&rider.getAge()>15&& rider.hasHelmet()==true){
            return true;
        } else if(pev.getClass().getSimpleName()==EMoped.class.getSimpleName()&&rider.getDriversLicense().validate(rider)){
            return true;
        } else {
            return false;
        }
    }

}
