
package passwordgenerator;
//simple java program to genrate random passowrd

import java.util.*;

public class PasswordGenerator {
 public static void main(String[] args) {
 Scanner console=new Scanner(System.in);
 String upper=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String lower="abcdefghijklmnopqrstuvwxyz";
 String digit="0123456789";
 String specialCharacter="-*&$#@_.()+|#!?<>,:";
 String comb=upper+lower+digit+specialCharacter;
 int len=8;
 char[]Pass=new char[len];
 Random r=new Random();
 for(int i=0;i<Pass.length;i++){
 Pass[i]=comb.charAt(r.nextInt(comb.length()));
    }
 System.out.println("Password generted:"+new String(Pass));
 }    
}
