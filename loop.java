public class loop {
    public static void main(String[] args) {
        //-------------for loop---------------
        for(int i=0; i<50; i++){ 
            if(i==10) break;  
            // if(i==10)continue;       
            System.out.println("Hellooooo"+i);
        }

        //--------------while loop---------------
        // int i = 1;
        // while (i<5) {
        //     System.out.println(i);
        //     i++;
        // }

        //---------------do while loop------------
        // int a = 0;
        // do{
        //     System.out.println(a);
        //     a++;
        // }while (a<5);


        //--------------for enhance loop--------------
        int arr[] = {1,2,3,4,5};
        for (int e:arr){
            System.out.println(e);
        }


        //-------------for each loop-----------------

    }
}
