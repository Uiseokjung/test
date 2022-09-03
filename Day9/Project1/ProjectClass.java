package Day9.Project1;

public class ProjectClass implements ProjectInterface {
    public int getVersion(){
        return ProjectInterface.version;
    }

    public boolean checkString(String str, String fstr){
        // 대소문자 무관하게 찾을 경우
        String str1 = str.toLowerCase();
        String str2 = fstr.toLowerCase();
        if(str2.indexOf(str1) >= 0){
            return true;
        }
        return false;
        /* 대소문자 구분하여 찾을 경우 
        if(fstr.indexOf(str) >= 0){
            return true;
        }
        return false;
*/
    }
    public String mergeString1(String[] params){
        String str = "";
        for(int i=0; i< params.length; i++){
            str += params[i] + " ";
        }
        return str;
    }
    public String mergeString2(String[] params){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< params.length; i++){
            sb.append(params[i] + " ");
        }
        String str = sb.toString();
        return str;
    }
    public String mergeString3(String[] params) throws Exception{
        StringBuffer sb = new StringBuffer();
        if(params.length == 1){
            throw new Exception("Only 1 Input Exception");
        }
        else{
            for(int i=0; i<params.length; i++){
                sb.append(params[i] + " ");
            }
        }
        String str = sb.toString();
        return str;
    }
}
