import com.google.gson.Gson;
public class file3 {
    class Student {
        private int id;
        private String name;
        private int age;
        private long phone;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public long getPhone() {
            return phone;
        }
        public void setPhone(long phone) {
            this.phone = phone;
        }
    }
    public class JacksionExample {
        public static void main(String args[]) throws Exception {
            Student std = new Student();
            std.setId(001);
            std.setName("Krishna");
            std.setAge(30);
            std.setPhone(9848022338L);
            //Creating the ObjectMapper object
            ObjectMapper mapper = new ObjectMapper();
            //Converting the Object to JSONString
            String jsonString = mapper.writeValueAsString(std);
            System.out.println(jsonString);
        }
    }
}
