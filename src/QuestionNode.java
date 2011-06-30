/**
 * Creates a Question node with a parent, yes, and no branch.
 * Also holds the question for the node.
 * @author Jackie
 *
 */
public class QuestionNode {
	
	private QuestionNode parent;
	private QuestionNode yes=null;
	private QuestionNode no=null;
	private String question;
	private String animal;
	
	/** Basic Constructor, sets the question and leaves parent null*/
	public QuestionNode(String question){
		this.question = question;
		this.parent = null;
	}
	
	/** Basic Constructor of animal*/
	public QuestionNode(String animal, QuestionNode parent, String a){
		this.animal = animal;
		question = "Is it a(n)" + animal + "?";
		this.yes = new QuestionNode("END GAME");
	}
	
	/** More intune constructor, sets a parent to a certain QuestionNode*/
	public QuestionNode(String question, QuestionNode parent){
		this.question = question;
		this.parent = parent;
	}
	
	/** Getter for question String*/
	public String askQuestion(){
		return question;
	}
	
	/** Sets yes child to @param QuestionNode*/
	public void setYes(QuestionNode newyes){
		yes = newyes;
	}
	
	/** @return what the yes child is*/
	public QuestionNode getYes(){
		return yes;
	}
	
	/** Sets the no child to @param QuestionNode*/
	public void setNo(QuestionNode newno){
		no = newno;
	}
	
	/**@returns what the no child is*/
	public QuestionNode getNo(){
		return no;
	}
	
	/**@return whether this question node has a yes child*/
	public boolean hasYes(){
		return !(yes==null);
	}
	
	/**@returns whether this question node has a no child*/
	public boolean hasNo(){
		return !(no==null);
	}
	
	/**@param string of the animal to put in */
	

}
