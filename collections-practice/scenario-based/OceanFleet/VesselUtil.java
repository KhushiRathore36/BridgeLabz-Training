package OceanFleet;
import java.util.*;
public class VesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();
	
	
	public void setList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	public List<Vessel> getList(){
		return vesselList;
	}
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel v : vesselList) {
			if(v.getId().equals(vesselId)) {
				return v;
			}
		}
		return null;		
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> result = new ArrayList<>();
		double maxSpeed = 0;
		
		for(Vessel v : vesselList) {
			if(v.getSpeed() > maxSpeed) {
				maxSpeed = v.getSpeed();
			}
			
		}
		
		for(Vessel v : vesselList) {
			if(v.getSpeed() == maxSpeed) {
				result.add(v);
			}
		}
		return result;
	}

}