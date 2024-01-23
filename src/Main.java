public class Main {
    public static void main(String[] args) {
       int data[] = {10,	5,	8,	100,	3,	9};


        System.out.println("Nueva Mejora de Performance");
        for(int i=0; i< data.length ;i++){
            System.out.print(data[i] + " ");
        }
        int temp;
        for(int j=0;j<data.length-1;j++){
            for(int i=0; i< data.length -1;i++){
                if(data[i] < data[i+1]){
                    temp = data[i];
                    data[i] = data[i+1];
                    data[i+1]  = temp;
                }
            }
        }
        System.out.println();
        System.out.println();


        for(int i=0; i< data.length ;i++){
            System.out.print(data[i] + " ");
        }



    }
}