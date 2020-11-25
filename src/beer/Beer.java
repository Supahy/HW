package beer;

public class Beer {
    private String name;
    private String type;
    private int alcAmount;
    private double volume;

    public Beer(String name, String type, int alcAmount, double volume){
        this.name = name;
        this.type = type;
        this.alcAmount = alcAmount;
        this.volume = volume;
    }



    @Override
    public int hashCode(){
        return alcAmount * 77777;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(obj == this){
            return true;
        }

        if(!(obj instanceof Beer)){
            return false;
        }

        Beer browar = (Beer) obj;

        if(!type.equals(browar.type)){
            return false;
        }

        if(alcAmount != (browar.alcAmount)){
            return false;
        }

        if(volume != (browar.volume)){
            return false;
        }
        return true;
    }
}
