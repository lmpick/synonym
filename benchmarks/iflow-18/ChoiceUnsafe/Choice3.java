class Choice3 {

    int in;
    boolean choice1;
    boolean choice2;
    boolean choice3;
    int update();

    public int equals (Choice3 o1, Choice3 o2, Choice3 n) {
        int a17 = 1;
        int a7 = 0;
        int a20 = 1;
        int a8 = 15; 
        int a12 = 8;
        int a16 = 5;
        int a21 = 1;
        int input = o1.in + o2.in;
        int r;
        if (n.choice1) {
          r = n.update();
        }
        if (n.choice2) {
          r = n.update();
        }
        if (n.choice3) {
          r = n.update();
        }
        if((((a8==15)&&(((((a21==1)&&(((a16==5)||(a16==6))&&(input==1)))&&(a20==1))&&(a17==1))&&!(a7==1)))&&(a12==8))){
          a16 = 5;
          a20 = 0;
          return 24;
        } else if((((((((input==5)&&((((a16==6)&&(a17==1))||(!(a17==1)&&(a16==4)))||(!(a17==1)&&(a16==5))))&&(a20==1))&&(a12==8))&&(a7==1))&&!(a21==1))&&(a8==13))){
          a20 = 0;
          a16 = 6;
          a17 = 0;
          a8 = 15;
          a7 = 0;
          a21 = 1;
          return 26;
        } else if(((!(a7==1)&&((((a16==6)&&((a21==1)&&((a17==1)&&(input==3))))&&!(a20==1))&&(a8==15)))&&(a12==8))){
          a20 = 1;
          a16 = 4;
          a7 = 1;
          a8 = 13;
          return -1;
        } else if(((a17==1)&&((!(a7==1)&&(((a21==1)&&((((a16==5)||(a16==6))&&(input==6))&&(a20==1)))&&(a8==15)))&&(a12==8)))){
          a8 = 13;
          a7 = 1;
          a16 = 4;
          return -1;
        } else if((((input==3)&&((((a16==6)&&((!(a20==1)&&(!(a7==1)&&!(a17==1)))&&(a8==15)))&&(a21==1))||((((a8==13)&&((a20==1)&&((a17==1)&&(a7==1))))&&(a16==4))&&!(a21==1))))&&(a12==8))){
          a7 = 0;
          a20 = 1;
          a21 = 1;
          a16 = 4;
          a17 = 1;
          a8 = 13;
          return -1;
        } else if((((a17==1)&&(((a21==1)&&((!(a7==1)&&((input==4)&&(a8==15)))&&!(a20==1)))&&(a12==8)))&&(a16==6))){
          a17 = 0;
          return 26;
        } else if((((a12==8)&&(((a21==1)&&((((input==5)&&!(a7==1))&&(a8==15))&&(a16==5)))&&!(a20==1)))&&!(a17==1))){
          a7 = 1;
          a16 = 4;
          a8 = 13;
          a20 = 1;
          a17 = 1;
          return -1;
        } else if(((a12==8)&&((input==1)&&(((a21==1)&&(((a8==15)&&((!(a17==1)&&!(a7==1))&&!(a20==1)))&&(a16==6)))||(!(a21==1)&&((a16==4)&&((a8==13)&&(((a17==1)&&(a7==1))&&(a20==1))))))))){
          a7 = 1;
          a17 = 1;
          a21 = 0;
          a20 = 1;
          a8 = 13;
          a16 = 5;
          return 26;
        } else if(((((!(a17==1)&&(!(a7==1)&&((a21==1)&&((a8==15)&&(input==4)))))&&!(a20==1))&&(a12==8))&&(a16==4))){
          a17 = 1;
          a16 = 5;
          return 21;
        } else if(((((((a16==6)&&((!(a20==1)&&(!(a17==1)&&!(a7==1)))&&(a8==15)))&&(a21==1))||(((a16==4)&&(((a20==1)&&((a17==1)&&(a7==1)))&&(a8==13)))&&!(a21==1)))&&(input==2))&&(a12==8))){
          a7 = 0;
          a20 = 1;
          a8 = 14;
          a16 = 4;
          a21 = 1;
          a17 = 0;
          return -1;
        } else if(((a8==13)&&(!(a21==1)&&((((input==3)&&((((a20==1)&&!(a17==1))&&(a16==6))||((!(a20==1)&&(a17==1))&&(a16==4))))&&(a12==8))&&(a7==1))))){
          a16 = 4;
          a17 = 1;
          a20 = 1;
          return 26;
        } else if(((((a21==1)&&((a12==8)&&((input==1)&&(((!(a20==1)&&(a17==1))&&(a16==4))||(((a16==5)&&(!(a17==1)&&(a20==1)))||((a16==6)&&(!(a17==1)&&(a20==1))))))))&&!(a7==1))&&(a8==15))){
          a16 = 6;
          a20 = 1;
          a17 = 0;
          return 24;
        } else if((((a16==5)&&(((a7==1)&&((!(a21==1)&&((a12==8)&&(input==3)))&&(a8==13)))&&(a17==1)))&&(a20==1))){
          a20 = 0;
          a8 = 15;
          a17 = 0;
          a21 = 1;
          return -1;
        } else if(((a17==1)&&(((a8==15)&&(((a12==8)&&((!(a7==1)&&(input==5))&&(a21==1)))&&!(a20==1)))&&(a16==5)))){
          a20 = 1;
          a8 = 13;
          a7 = 1;
          a16 = 4;
          return -1;
        } else if((!(a7==1)&&(((((a21==1)&&(((a8==15)&&(input==5))&&!(a17==1)))&&(a12==8))&&(a20==1))&&(a16==4)))){
          a8 = 13;
          a17 = 1;
          a7 = 1;
          return -1;
        } else if(((!(a21==1)&&(((a12==8)&&((((a16==6)&&((a20==1)&&!(a17==1)))||((!(a20==1)&&(a17==1))&&(a16==4)))&&(input==1)))&&(a8==13)))&&(a7==1))){
          a16 = 6;
          a20 = 1;
          a17 = 0;
          return -1;
        } else if(((a17==1)&&(!(a7==1)&&(((a21==1)&&(((a12==8)&&((input==5)&&((a16==5)||(a16==6))))&&(a20==1)))&&(a8==15))))){
          a7 = 1;
          a16 = 4;
          a8 = 13;
          return -1;
        } else if((((a12==8)&&(!(a21==1)&&((a7==1)&&((a8==13)&&((input==6)&&((((a16==6)&&(a17==1))||((a16==4)&&!(a17==1)))||((a16==5)&&!(a17==1))))))))&&(a20==1))){
          a8 = 15;
          a17 = 0;
          a21 = 1;
          a20 = 0;
          a16 = 4;
          return -1;
        } else if((((a16==5)&&((((a8==15)&&((!(a7==1)&&(input==2))&&(a21==1)))&&(a12==8))&&!(a20==1)))&&!(a17==1))){
          a16 = 4;
          a17 = 1;
          return 24;
        } else if((!(a20==1)&&((a21==1)&&((a16==4)&&((a8==15)&&(((a12==8)&&((input==2)&&!(a7==1)))&&!(a17==1))))))){
          a17 = 1;
          a16 = 5;
          return 21;
        } else if((((a21==1)&&(!(a7==1)&&((!(a20==1)&&(!(a17==1)&&((a12==8)&&(input==6))))&&(a16==4))))&&(a8==15))){
          a20 = 1;
          a16 = 6;
          return 22;
        } else if(((a17==1)&&((((((a12==8)&&((input==4)&&(a8==13)))&&(a20==1))&&!(a21==1))&&(a16==5))&&(a7==1)))){
          a16 = 4;
          a17 = 0;
          return 25;
        } else if(((((a8==13)&&((a12==8)&&((((((a16==6)&&(a17==1))||(!(a17==1)&&(a16==4)))||(!(a17==1)&&(a16==5)))&&(input==1))&&!(a21==1))))&&(a20==1))&&(a7==1))){
          a8 = 15;
          a16 = 6;
          a21 = 1;
          a20 = 0;
          a7 = 0;
          a17 = 1;
          return -1;
        } else if(((a8==13)&&(!(a21==1)&&((((((!(a17==1)&&(a20==1))&&(a16==6))||((a16==4)&&((a17==1)&&!(a20==1))))&&(input==5))&&(a7==1))&&(a12==8))))){
          a17 = 1;
          a20 = 0;
          a16 = 4;
          return 25;
        } else if(((!(a21==1)&&((((((a16==6)&&((a20==1)&&!(a17==1)))||(((a17==1)&&!(a20==1))&&(a16==4)))&&(input==4))&&(a7==1))&&(a12==8)))&&(a8==13))){
          a8 = 15;
          a21 = 1;
          a20 = 0;
          a7 = 0;
          a16 = 6;
          a17 = 0;
          return 26;
        } else if((((a21==1)&&(!(a7==1)&&((((((a16==5)&&((a20==1)&&!(a17==1)))||((!(a17==1)&&(a20==1))&&(a16==6)))||((a16==4)&&((a17==1)&&!(a20==1))))&&(input==4))&&(a12==8))))&&(a8==15))){
          a16 = 4;
          a20 = 0;
          a17 = 0;
          return 24;
        } else if(((((((a16==6)&&((!(a20==1)&&(!(a17==1)&&!(a7==1)))&&(a8==15)))&&(a21==1))||(((a16==4)&&((((a7==1)&&(a17==1))&&(a20==1))&&(a8==13)))&&!(a21==1)))&&(input==4))&&(a12==8))){
          a17 = 0;
          a16 = 5;
          a21 = 1;
          a8 = 14;
          a7 = 1;
          a20 = 1;
          return -1;
        } else if((!(a17==1)&&(((a12==8)&&(!(a20==1)&&(((a8==15)&&((a21==1)&&(input==4)))&&!(a7==1))))&&(a16==5)))){
          a17 = 1;
          return 24;
        } else if((((!(a7==1)&&(((input==2)&&((((a16==5)&&((a20==1)&&!(a17==1)))||((a16==6)&&((a20==1)&&!(a17==1))))||((a16==4)&&(!(a20==1)&&(a17==1)))))&&(a8==15)))&&(a12==8))&&(a21==1))){
          a17 = 0;
          a16 = 5;
          a20 = 1;
          return 25;
        } else if((!(a20==1)&&(((((((input==6)&&(a16==5))&&(a21==1))&&!(a17==1))&&(a12==8))&&!(a7==1))&&(a8==15)))){
          a17 = 1;
          return 24;
        } else if(((a12==8)&&(((((((a21==1)&&(input==5))&&(a8==15))&&(a17==1))&&!(a7==1))&&!(a20==1))&&(a16==6)))){
          a20 = 1;
          a16 = 4;
          a7 = 1;
          a8 = 13;
          return -1;
        } else if(((((a8==15)&&(!(a7==1)&&((((!(a20==1)&&(a17==1))&&(a16==4))||(((!(a17==1)&&(a20==1))&&(a16==5))||((a16==6)&&((a20==1)&&!(a17==1)))))&&(input==6))))&&(a12==8))&&(a21==1))){
          a20 = 0;
          a17 = 1;
          a16 = 4;
          return 22;
        } else if(((a8==15)&&((a16==4)&&(!(a20==1)&&((((a21==1)&&(!(a17==1)&&(input==5)))&&!(a7==1))&&(a12==8)))))){
          a7 = 1;
          a8 = 13;
          a17 = 1;
          a20 = 1;
          return -1;
        } else if(((a17==1)&&((a12==8)&&((a8==15)&&(((!(a7==1)&&(((a16==5)||(a16==6))&&(input==2)))&&(a21==1))&&(a20==1)))))){
          a17 = 0;
          a16 = 6;
          return 22;
        } else if((!(a7==1)&&(((a8==15)&&((!(a17==1)&&((a12==8)&&((input==3)&&(a21==1))))&&(a16==4)))&&(a20==1)))){
          a17 = 1;
          a7 = 1;
          a8 = 13;
          return -1;
        } else if(((a16==5)&&((!(a21==1)&&(((a8==13)&&(((input==2)&&(a20==1))&&(a12==8)))&&(a7==1)))&&(a17==1)))){
          a21 = 1;
          a8 = 14;
          a16 = 4;
          a20 = 0;
          a7 = 0;
          a17 = 0;
          return -1;
        } else if(((a20==1)&&(((a12==8)&&((a7==1)&&((a8==13)&&(((!(a17==1)&&(a16==5))||(((a17==1)&&(a16==6))||(!(a17==1)&&(a16==4))))&&(input==3)))))&&!(a21==1)))){
          a8 = 14;
          a7 = 0;
          a17 = 1;
          a21 = 1;
          a16 = 4;
          return -1;
        } else if(((a12==8)&&((a7==1)&&(!(a21==1)&&((a8==13)&&((input==6)&&(((a16==6)&&((a20==1)&&!(a17==1)))||((a16==4)&&((a17==1)&&!(a20==1)))))))))){
          a20 = 0;
          a21 = 1;
          a17 = 0;
          a8 = 14;
          a16 = 4;
          return -1;
        } else if(((!(a7==1)&&(!(a17==1)&&((((a16==4)&&((a8==15)&&(input==1)))&&(a12==8))&&(a21==1))))&&(a20==1))){
          a7 = 1;
          a8 = 13;
          a17 = 1;
          return -1;
        } else if(((a17==1)&&(((a21==1)&&(!(a20==1)&&((a12==8)&&((a8==15)&&(!(a7==1)&&(input==1))))))&&(a16==6)))){
          a20 = 1;
          a8 = 13;
          a7 = 1;
          a16 = 4;
          return -1;
        } else if(((a20==1)&&((a12==8)&&((((a17==1)&&((((a16==5)||(a16==6))&&(input==4))&&(a8==15)))&&(a21==1))&&!(a7==1))))){
          a16 = 4;
          a7 = 1;
          a8 = 13;
          return -1;
        } else if(((((a8==13)&&((((!(a21==1)&&(input==6))&&(a20==1))&&(a12==8))&&(a17==1)))&&(a7==1))&&(a16==5))){
          a16 = 4;
          a20 = 0;
          return 25;
        } else if(((a16==5)&&(((((a12==8)&&(!(a7==1)&&((input==2)&&!(a20==1))))&&(a21==1))&&(a17==1))&&(a8==15)))){
          a17 = 0;
          return 24;
        } else if((((a12==8)&&(((!(a17==1)&&((a21==1)&&((input==4)&&!(a7==1))))&&(a8==15))&&(a20==1)))&&(a16==4))){
          a20 = 0;
          a17 = 1;
          a16 = 6;
          return 21;
        } else if(((a7==1)&&((a8==13)&&((a12==8)&&(!(a21==1)&&((input==2)&&((((a20==1)&&!(a17==1))&&(a16==6))||(((a17==1)&&!(a20==1))&&(a16==4))))))))){
          a16 = 4;
          a20 = 0;
          a17 = 1;
          return -1;
        } else if((((((((!(a20==1)&&(!(a17==1)&&!(a7==1)))&&(a8==15))&&(a16==6))&&(a21==1))||((((a8==13)&&(((a17==1)&&(a7==1))&&(a20==1)))&&(a16==4))&&!(a21==1)))&&(input==6))&&(a12==8))){
          a20 = 1;
          a8 = 13;
          a16 = 4;
          a7 = 0;
          a21 = 1;
          a17 = 0;
          return -1;
        } else if(((!(a7==1)&&(!(a17==1)&&(((((input==3)&&(a21==1))&&(a16==4))&&(a8==15))&&(a12==8))))&&!(a20==1))){
          a17 = 1;
          a7 = 1;
          a8 = 13;
          a20 = 1;
          return -1;
        } else if((((((a12==8)&&(((((a17==1)&&!(a20==1))&&(a16==4))||((((a20==1)&&!(a17==1))&&(a16==5))||((!(a17==1)&&(a20==1))&&(a16==6))))&&(input==3)))&&(a8==15))&&(a21==1))&&!(a7==1))){
          a16 = 4;
          a17 = 1;
          a8 = 13;
          a20 = 1;
          a7 = 1;
          return -1;
        } else if((((!(a7==1)&&(((input==5)&&((((a16==5)&&(!(a17==1)&&(a20==1)))||((a16==6)&&((a20==1)&&!(a17==1))))||((a16==4)&&(!(a20==1)&&(a17==1)))))&&(a12==8)))&&(a21==1))&&(a8==15))){
          a16 = 4;
          a17 = 1;
          a7 = 1;
          a20 = 1;
          a8 = 13;
          return -1;
        } else if(((!(a7==1)&&(((a21==1)&&(((a17==1)&&((a12==8)&&(input==2)))&&!(a20==1)))&&(a16==6)))&&(a8==15))){
          a8 = 13;
          a20 = 1;
          a16 = 4;
          a7 = 1;
          return -1;
        } else if(((!(a17==1)&&((a21==1)&&((!(a20==1)&&((a12==8)&&((input==3)&&!(a7==1))))&&(a8==15))))&&(a16==5))){
          a8 = 13;
          a16 = 4;
          return -1;
        } else if((((a16==5)&&(!(a20==1)&&(((((input==6)&&(a21==1))&&(a17==1))&&!(a7==1))&&(a12==8))))&&(a8==15))){
          return 24;
        } else if((!(a7==1)&&((a17==1)&&(((a16==6)&&(!(a20==1)&&(((input==6)&&(a12==8))&&(a21==1))))&&(a8==15))))){
          a7 = 1;
          a8 = 13;
          a20 = 1;
          a16 = 4;
          return -1;
        } else if(((((a21==1)&&((a8==15)&&((a12==8)&&(!(a7==1)&&(!(a17==1)&&(input==2))))))&&(a16==4))&&(a20==1))){
          a17 = 1;
          a8 = 13;
          a7 = 1;
         return -1;
        } else if(((a8==15)&&(((a16==4)&&((a12==8)&&((!(a20==1)&&(!(a7==1)&&(input==1)))&&!(a17==1))))&&(a21==1)))){
          a16 = 6;
          a20 = 1;
          return 22;
        } else if(((a21==1)&&(((a12==8)&&((((a17==1)&&((input==3)&&((a16==5)||(a16==6))))&&!(a7==1))&&(a20==1)))&&(a8==15)))){
          a17 = 0;
          a16 = 4;
          return 21;
        } else if((!(a21==1)&&((a20==1)&&(((a12==8)&&((a8==13)&&((((a16==5)&&!(a17==1))||(((a17==1)&&(a16==6))||(!(a17==1)&&(a16==4))))&&(input==2))))&&(a7==1))))){
          a21 = 1;
          a8 = 15;
          a17 = 1;
          a7 = 0;
          a16 = 6;
          a20 = 0;
         return -1;
        } else if(((a7==1)&&((a12==8)&&((((a20==1)&&(((!(a17==1)&&(a16==5))||(((a17==1)&&(a16==6))||((a16==4)&&!(a17==1))))&&(input==4)))&&(a8==13))&&!(a21==1))))){
          a8 = 15;
          a16 = 6;
          a21 = 1;
          a7 = 0;
          a20 = 0;
          a17 = 0;
          return 26;
        } else if(((a21==1)&&((((!(a7==1)&&((a8==15)&&(!(a20==1)&&(input==4))))&&(a17==1))&&(a16==5))&&(a12==8)))){
          return 24;
        } else if((((!(a7==1)&&((!(a20==1)&&((a21==1)&&((input==3)&&(a17==1))))&&(a8==15)))&&(a12==8))&&(a16==5))){
          a20 = 1;
          a8 = 13;
          a7 = 1;
          a16 = 4;
          return -1;
        } else if(((((!(a17==1)&&(!(a20==1)&&((a8==15)&&((input==1)&&(a16==5)))))&&(a12==8))&&(a21==1))&&!(a7==1))){
          return -1;
        } else if(((((a21==1)&&((a8==15)&&(((a16==5)&&((a12==8)&&(input==1)))&&(a17==1))))&&!(a7==1))&&!(a20==1))){
          return 21;
        } else if(((!(a21==1)&&((a20==1)&&((((a8==13)&&((a7==1)&&(input==5)))&&(a17==1))&&(a12==8))))&&(a16==5))){
          a21 = 1;
          a7 = 0;
          a17 = 0;
          a8 = 14;
          a20 = 0;
          return -1;
        } else if((((!(a7==1)&&((a21==1)&&((((input==6)&&(a20==1))&&(a8==15))&&!(a17==1))))&&(a12==8))&&(a16==4))){
          a7 = 1;
          a8 = 13;
          a17 = 1;
          return -1;
        } else if(((((a20==1)&&(((!(a21==1)&&((a7==1)&&(input==1)))&&(a8==13))&&(a17==1)))&&(a12==8))&&(a16==5))){
          a21 = 1;
          a16 = 6;
          a7 = 0;
          return -1;
        } else if(((a12==8)&&((input==5)&&((((((!(a17==1)&&!(a7==1))&&!(a20==1))&&(a8==15))&&(a16==6))&&(a21==1))||(!(a21==1)&&((a16==4)&&(((a20==1)&&((a7==1)&&(a17==1)))&&(a8==13)))))))){
          a20 = 0;
          a21 = 1;
          a8 = 14;
          a17 = 0;
          a16 = 5;
          a7 = 1;
          return -1;
        } 
        return r;
      }

}
