package stack;
/**
 * 
 * Implementation using single array for 3 stacks
 * 
 * @author uzma
 */
public class ThreeStacks {
	
	private int stackSize;
	private int[] array;
	private int[] stackPointer = {0, 0, 0};
	
	
	public ThreeStacks(int stackSize){
		this.stackSize = stackSize;
		this.array = new int[3*stackSize];
	}
	
	/**
	 * push to indicated stack
	 * 
	 * @param stackNum is 0 based
	 * @param data to be pushed
	 */
	public void push(int stackNum, int data) {
		int stackIndex = stackPointer[stackNum];
		if(stackIndex < stackSize){
		int arrayindex = stackNum * stackSize + stackIndex ; 
			array[arrayindex] = data;
			stackPointer[stackNum]++;
		} else{
			System.out.println("Error! stack " + stackNum + " full");
		}
	}
	
	public int pop(int stackNum){
		int stackIndex = stackPointer[stackNum] - 1;
		if(stackIndex >= 0){
			// get the value
			int arrayIndex = stackNum * stackSize + stackIndex;
			// decrement stack pointer
			stackPointer[stackNum]--;
			return array[arrayIndex];
		}
		System.out.println("Error! stack " + stackNum + " empty");
		return -1;
	}
	
	public boolean isEmpty(int stackNum){
		return (stackPointer[stackNum] == 0);
	}
	
	public boolean isFull(int stackNum){
		return (stackPointer[stackNum] == stackSize);
	}
	
	public int getStackSize(){
		return stackSize;
	}
}
