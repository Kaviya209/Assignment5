package ArrayListAssignment1;

	import java.util.ArrayList;
	import java.util.List;

	public class Tester {

		public static ArrayList<Participant> generateListOfFinalists(Participant[] finalists) {
			// Implement your logic here and change the return statement accordingly
			ArrayList<Participant>finalistList=new ArrayList<Participant>();
			for(Participant finalist:finalists) {
				finalistList.add(finalist);
			}
			return finalistList;
		}

		public static ArrayList<Participant> getFinalistsByTalent(List<Participant> finalists, String talent) {
			// Implement your logic here and change the return statement accordingly
			ArrayList<Participant>finalisByTalent=new ArrayList<Participant>();
			for(Participant finalist:finalists) {
				if (finalist.getParticipantTalent().equals(talent)) {
				finalisByTalent.add(finalist);
				}
			}
			return  finalisByTalent;
		}

		public static void main(String[] args) {
			Participant finalist1 = new Participant("Hazel", "Singing", 91.2);
			Participant finalist2 = new Participant("Ben", "Instrumental", 95.7);
			Participant finalist3 = new Participant("John", "Singing", 94.5);
			Participant finalist4 = new Participant("Bravo", "Singing", 97.6);

			Participant[] finalists = { finalist1, finalist2, finalist3, finalist4 };

			ArrayList<Participant> finalistsList =generateListOfFinalists(finalists);

			System.out.println("generateListOffinalist() : \n"+ finalistsList);
			

			ArrayList<Participant> finalistsByTalent =getFinalistsByTalent(finalistsList,"Singing");
			
		    System.out.println("getfinalistsByTalent() : \n" +finalistsByTalent);
		}

	}