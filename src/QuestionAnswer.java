import java.util.Scanner;


public class QuestionAnswer {
	
	static Scanner scanner = new Scanner(System.in);
	static boolean cont;
	static QuestionNode head = new QuestionNode("Does it have fur?");
	static QuestionNode curr;
	static QuestionNode parent;
	static String newquestion;
	
	public static void main(String[] args){
		cont = true;
		newGame();	
	}
	
	public static void newGame(){
		curr = head;
		
		System.out.println("Think of an animal");
		
		while(cont){
			System.out.println(curr.askQuestion());
			System.out.println("Type y for yes and n for no");
			String input = scanner.nextLine();
			if(input=="y"){
				if(curr.hasYes()){
					if(curr.getYes().askQuestion()=="ENDGAME"){
						cont=false;
					}
					else{
						parent=curr;
						curr=parent.getYes();
					}
				}
				else{
					//getAnimal();
					
				}
			}
			else if(input=="n"){
				if(curr.hasNo()){
					parent=curr;
					curr=parent.getNo();
				}
				else{
					
				}
			}
		}
	}
	
	public static String getAnimal(){
		System.out.println("What is your animal?");
		return scanner.nextLine();
	}

}
