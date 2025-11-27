package getCode;

public class getCode {
    public static void main(String[] args) {
        System.out.println(getCode(5));
    }
    //生成指定长度的随机验证码
    public static String getCode(int n){
        //定义一个空字符串用于存储验证码
        String code="";
        //循环n次，每次生成一个随机字符并添加到code中
        for(int i=0;i<n;i++){
            int type=(int)(Math.random()*3);
            switch(type){
                case 0:
                    //数字
                    char num=(char)((int)(Math.random()*10)+'0');
                    code+=num;
                    break;
                case 1:
                    //大写字母
                    char upper=(char)((int)(Math.random()*26)+'A');
                    code+=upper;
                    break;
                case 2:
                    //小写字母
                    char lower=(char)((int)(Math.random()*26)+'a');
                    code+=lower;
                    break;
            }
        }
        return code;
    }
    }

