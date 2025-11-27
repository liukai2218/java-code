package Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        System.out.println(getRandomName());
    }
    //我是一个java初学者，创建一个方法用于随机挑选一个名字，名字有50个，名字存储在一个数组中
    public static String getRandomName() {
        String[] names = {
            "Alice", "Bob", "Charlie", "David", "Eve",
            "Frank", "Grace", "Hannah", "Ivy", "Jack",
            "Kathy", "Liam", "Mia", "Noah", "Olivia",
            "Paul", "Quinn", "Rachel", "Sam", "Tina",
            "Uma", "Violet", "Wendy", "Xander", "Yara",
            "Zane", "Aaron", "Bella", "Carter", "Diana",
            "Ethan", "Fiona", "Gavin", "Hailey", "Ian",
            "Jasmine", "Kevin", "Luna", "Mason", "Nora",
            "Owen", "Piper", "Quincy", "Riley", "Sophia",
            "Tyler", "Ursula", "Victor", "Willow", "Xenia"
        };

        int randomIndex = (int) (Math.random() * names.length);

        return names[randomIndex];
    }
}
