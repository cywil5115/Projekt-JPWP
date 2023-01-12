public class BazaDanych {

    int IDFirst=1;
    int IDSecond;

    int IDQuestion;



    public void saveIdOfASecondKey(int idKey){
        this.IDSecond=idKey;
    }
    public void saveIdOfAQuestion(int q){
        this.IDQuestion=q;
    }

    public boolean AnswerChecker(){
        if(IDSecond==IDQuestion){
            return true;
        }
        else {
            return false;
        }
    }

    public void resetQuestion(){
        IDFirst=1;
        IDSecond=0;
        IDQuestion=155;
    }


}
