public class Drago implements Runnable{
    private int numBattiti;
    private String nome;


    public Drago(String nome, int count){
        setName(nome+"thread contatore che inmplementa l'interfaccia Runnable");

    }

    @Override
    public void run(){
        for (int i=0; i<count; i++){
            System.out.println(this.getName()+" conta "+(i+1));
//            Thread.sleep(1000);
        }
    }

    private void setName(String s){ this.name =s;}
    private String getName(){return name;}

}
