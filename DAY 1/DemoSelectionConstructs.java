class DemoSelectionConstructs{
	public static void main(String[] args){
        int number = 3;

        if(number == 1){
		System.out.println("One");
        }

	else if(number == 2){
		System.out.println("Two");
        }

	else if(number == 3){
		System.out.println("Three");
        }
	
	else{
		System.out.println("Invalid Number");
        }


	switch(number){
   		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;

		case 3:
			System.out.println("THREE");
			break;

		default:
			System.out.println("INCORRECT");
			break;
	}
}