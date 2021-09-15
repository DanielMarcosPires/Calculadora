import java.util.Scanner;

public class Sistema {
    private int soma;
    private double somad;
    public Sistema(){
        System.out.println("Testando a Integridade Do Sistema");
    }
    public void Calculos(int x,int y,double q,double e){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja calcular Inteiros");
        System.out.println("Se sim Escreva Inteiros se não aperta enter pra passar");
        System.out.print(">");
        String Inteiro = s.nextLine();
        if(Inteiro.equals("Sim")||Inteiro.equals("sim")){
            System.out.println("Numeros inteiros");
                //---------------------------------------------------------
            System.out.println("Primeiro Numero: ");
            System.out.print(">");
            x = s.nextInt();
                //----------------------------------------------------------
            System.out.println("Segundo Numero: ");
            System.out.print(">");
            y = s.nextInt();
                //-----------------------------------------------------------
                System.out.println("Escolha operadores matematicos");
                System.out.println("{1 = +},{2 = -},{3 = *},{4 = /}");
                System.out.print(">");
                switch(s.nextInt()){
                case 1:System.out.println(x+y);//+
                soma = x + y;
                break;
                case 2:System.out.println(x-y);//-
                soma = x - y;
                break;
                case 3:System.out.println(x*y);//*
                soma = x * y;
                break;
                case 4:System.out.println(x/y);//Divisão
                soma = x / y;
                break;
            }
        }
        System.out.println("--------------------------------------");  

        System.out.println("Deseja calcular numeros Reais");
        System.out.println("Aperte enter para finalizar a operação");
        String real = s.nextLine();
        System.out.print(">");
        
        if(real.equals("Sim")||real.equals("sim")){
            System.out.println("Numeros Reais");// double q , e
            System.out.println("Primeiro numero:");
            System.out.print(">");
            q = s.nextDouble();
            System.out.println("Segundo numero:");
            System.out.print(">");
            e = s.nextDouble();
            System.out.println("{1 = +},{2 = -},{3 = *},{4 = /}");
            switch(s.nextInt()){
                case 1:System.out.println(q+e);//+
                somad = q+e;
                break;
                case 2:System.out.println(q-e);//-
                somad = q-e;
                break;
                case 3:System.out.println(q*e);//*
                somad = q*e;
                break;
                case 4:System.out.println(q/e);//Divisão
                somad = q/e;
                break;
            }
            
        }else{
            System.out.println("----------------------");
            System.out.println("Operação Finalizado");
            System.out.println("----------------------");

        }
        

    }
}