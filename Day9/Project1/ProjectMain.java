package Day9.Project1;

public class ProjectMain {
    public static void main(String[] args) {
        ProjectClass pc = new ProjectClass();

        //getVersion
        System.out.println("Version : " + pc.getVersion());

        //checkString
        System.out.println(pc.checkString("My name is J", "AME"));

        //mergeString
        String[] list1 = {"The", "Cruise", "is", "very", "big"};
        String[] list2 = {"James"};
        
        System.out.println(pc.mergeString1(list1));
        System.out.println(pc.mergeString1(list2));

        System.out.println(pc.mergeString2(list1));
        System.out.println(pc.mergeString2(list2));

        try{
            System.out.println(pc.mergeString3(list1));
            System.out.println(pc.mergeString3(list2));
    
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
