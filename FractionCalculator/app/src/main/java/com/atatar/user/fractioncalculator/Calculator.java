package com.atatar.user.fractioncalculator;

public class Calculator {

   private String integer1="";
   private String integer2="";
   private String fract11="";
   private String fract12="";
   private String fract21="";
   private String fract22="";
    private String integerResalt="";
    private String fract1Resalt="";
    private String fract2Resalt="";
   private String znak="";
    private String znakResalt="";
    private String rawno="";
    private String monitorString="";

    public String getMonitorString(){
String hightLetters = "Huge";


Integer strigSize = integer1.length() + fract11.length() + fract12.length() + integer2.length()
                   +fract21.length() + fract22.length() + integerResalt.length()
                   + fract1Resalt.length() + fract2Resalt.length()+ znakResalt.length();
        if (strigSize>12 && strigSize<16)
            hightLetters = "huge";  //20
        else if (strigSize>16 && strigSize<=26)
            hightLetters = "Large";  //26
        else if (strigSize>27 && strigSize<=36)
            hightLetters = "large";  //


            monitorString = "$$\\"+hightLetters+"{" + integer1 + "\\frac{" + fract11 + "}{" + fract12 + "}  "
                    + znak + "  "
                    + integer2 + "\\frac{" + fract21 + "}{" + fract22 + "} "
                    + rawno  + znakResalt
                    + integerResalt + "\\frac{" + fract1Resalt + "}{" + fract2Resalt + "}}$$";

       return monitorString;
    }
    public void clearMonitorString(){
        integer1 = integer2 = fract11 = fract12 = fract21 = fract22 = znak = rawno = znakResalt =
                                       integerResalt = fract1Resalt= fract2Resalt="";
    }

    public void getResaltCalculate(){
        switch (znak){

            case "+":{
                additionFractions();
            }
            break;
            case "-":{
                subtractionFractions();
                }
            break;
            case "*":{
                multiplicationFractions ();
                     }
            break;
            case ":":{
                divisionFractions ();
                    }
            break;

        }
    }

    private void additionFractions() {

        if (!fract11.equals("") || !fract21.equals("")) {


            if (fract11.equals("") || fract21.equals("")) {
                if (fract11.equals("")) {
                    fract1Resalt = fract21;
                    fract2Resalt = fract22;
                    integerResalt = integer1;
                } else {
                    fract1Resalt = fract11;
                    fract2Resalt = fract12;
                    integerResalt = integer2;
                }

            } else {
                int valueFractBottom1 = Integer.parseInt(fract12);
                int valueFractBottom2 = Integer.parseInt(fract22);
                int valueFractTop1, valueFractTop2;
                if (!integer1.equals("")) {
                    valueFractTop1 = Integer.parseInt(integer1) * Integer.parseInt(fract12) + Integer.parseInt(fract11);
                } else {
                    valueFractTop1 = Integer.parseInt(fract11);
                }
                if (!integer2.equals("")) {
                    valueFractTop2 = Integer.parseInt(integer2) * Integer.parseInt(fract22) + Integer.parseInt(fract21);
                } else {
                    valueFractTop2 = Integer.parseInt(fract21);
                }

                if (valueFractBottom1 == valueFractBottom2) {
                    fract1Resalt = String.valueOf(valueFractTop1 + valueFractTop2);
                    fract2Resalt = String.valueOf(valueFractBottom1);
                } else {
                    fract1Resalt = String.valueOf(valueFractTop1 * valueFractBottom2 + valueFractTop2 * valueFractBottom1);
                    fract2Resalt = String.valueOf(valueFractBottom1 * valueFractBottom2);
                }


            }
            reductionFractions();
        }else integerResalt = String.valueOf(Integer.parseInt(integer1) + Integer.parseInt(integer2));
    }

    private void subtractionFractions() {
        int valueFractBottom1, valueFractBottom2, valueFractTop1, valueFractTop2;

        if (!fract11.equals("") || !fract21.equals("")) {


            if (fract11.equals("") || fract21.equals("")) {


            if (fract11.equals("")) {
                valueFractTop1 = Integer.parseInt(integer1) * Integer.parseInt(fract22);
                valueFractBottom1 = Integer.parseInt(fract22);
            } else {
                if(!integer1.equals(""))
                valueFractTop1 = Integer.parseInt(integer1) * Integer.parseInt(fract12) + Integer.parseInt(fract11);
                else valueFractTop1 =  Integer.parseInt(fract11);
                valueFractBottom1 = Integer.parseInt(fract12);
            }

            if (fract21.equals("")) {
                valueFractTop2 = Integer.parseInt(integer2) * Integer.parseInt(fract12);
                valueFractBottom2 = Integer.parseInt(fract12);
            } else {
                if(!integer2.equals(""))
                valueFractTop2 = Integer.parseInt(integer2) * Integer.parseInt(fract22) + Integer.parseInt(fract21);
                else valueFractTop2 =  Integer.parseInt(fract21);
                valueFractBottom2 = Integer.parseInt(fract22);
            }

        } else {
                if(!integer1.equals(""))
            valueFractTop1 = Integer.parseInt(integer1) * Integer.parseInt(fract12) + Integer.parseInt(fract11);
                else valueFractTop1 =  Integer.parseInt(fract11);
            valueFractBottom1 = Integer.parseInt(fract12);
                if(!integer2.equals(""))
            valueFractTop2 = Integer.parseInt(integer2) * Integer.parseInt(fract22) + Integer.parseInt(fract21);
                else valueFractTop2 =  Integer.parseInt(fract21);
            valueFractBottom2 = Integer.parseInt(fract22);
        }

        if (valueFractBottom1 != valueFractBottom2) {
            fract1Resalt = String.valueOf(valueFractTop1 * valueFractBottom2 - valueFractTop2 * valueFractBottom1);
            fract2Resalt = String.valueOf(valueFractBottom1 * valueFractBottom2);
        } else {
            fract1Resalt = String.valueOf(valueFractTop1 - valueFractTop2);
            fract2Resalt = String.valueOf(valueFractBottom1);
        }
            reductionFractions ();
        }else integerResalt = String.valueOf(Integer.parseInt(integer1) - Integer.parseInt(integer2));
    }

    private void multiplicationFractions (){
        if (!fract11.equals("") || !fract21.equals("")) {

            if (fract11.equals("") || fract21.equals("")) {
                if (fract11.equals("")) {

                    if (!integer2.equals(""))
                        fract1Resalt = String.valueOf((Integer.parseInt(integer1)
                                * (Integer.parseInt(integer2)
                                * Integer.parseInt(fract22) + Integer.parseInt(fract21))));
                    else
                        fract1Resalt = String.valueOf((Integer.parseInt(integer1)
                                * Integer.parseInt(fract21)));
                    fract2Resalt = String.valueOf((Integer.parseInt(fract22)));


                } else {

                    if (!integer1.equals("")) {
                        integerResalt = String.valueOf((Integer.parseInt(integer1)
                                * Integer.parseInt(integer2)));
                    }
                    fract1Resalt = String.valueOf((Integer.parseInt(fract11)
                            * Integer.parseInt(integer2)));
                    fract2Resalt = String.valueOf((Integer.parseInt(fract12)));
                }

            } else {
                int fraction11, fraction21;
                if (!integer1.equals("")) {
                    fraction11 = Integer.parseInt(integer1) * Integer.parseInt(fract12) + Integer.parseInt(fract11);
                } else fraction11 = Integer.parseInt(fract11);
                if (!integer2.equals("")) {
                    fraction21 = Integer.parseInt(integer2) * Integer.parseInt(fract22) + Integer.parseInt(fract21);
                } else fraction21 = Integer.parseInt(fract21);
                fract1Resalt = String.valueOf(fraction11 * fraction21);
                fract2Resalt = String.valueOf(Integer.parseInt(fract12) * Integer.parseInt(fract22));
            }


            reductionFractions();
        } else integerResalt = String.valueOf(Integer.parseInt(integer1) * Integer.parseInt(integer2));
    }

    private void divisionFractions (){

        if (!fract11.equals("") || !fract21.equals("")) {

            if (fract11.equals("") || fract21.equals("")) {
                if (fract11.equals("")) {

                    if (!integer2.equals("")) {
                        fract2Resalt = String.valueOf(Integer.parseInt(integer2)
                                * Integer.parseInt(fract22) + Integer.parseInt(fract21));
                        fract1Resalt = String.valueOf((Integer.parseInt(integer1)
                                * Integer.parseInt(fract22)));
                    } else {
                        fract2Resalt = String.valueOf(Integer.parseInt(fract21));
                        fract1Resalt = String.valueOf((Integer.parseInt(integer1) * Integer.parseInt(fract22)));
                    }

                } else {

                    if (!integer1.equals("")) {
                        fract1Resalt = String.valueOf((Integer.parseInt(integer1)
                                * Integer.parseInt(fract12)
                                + Integer.parseInt(fract11)));
                    } else
                        fract1Resalt = String.valueOf((Integer.parseInt(fract11)));
                    fract2Resalt = String.valueOf((Integer.parseInt(fract12) * Integer.parseInt(integer2)));
                }

            } else {

                int fract1, fract2;

                if (!integer1.equals(""))
                    fract1 = Integer.parseInt(integer1) * Integer.parseInt(fract12) + Integer.parseInt(fract11);
                else
                    fract1 = Integer.parseInt(fract11);
                if (!integer2.equals(""))
                    fract2 = Integer.parseInt(integer2) * Integer.parseInt(fract22) + Integer.parseInt(fract21);
                else
                    fract2 = Integer.parseInt(fract21);

                fract1Resalt = String.valueOf((fract1 * Integer.parseInt(fract22)));
                fract2Resalt = String.valueOf(Integer.parseInt(fract12) * fract2);
            }

            reductionFractions();
        }else integerResalt = String.valueOf(Integer.parseInt(integer1) / Integer.parseInt(integer2));
    }

    private void reductionFractions (){
        if(Integer.parseInt(fract1Resalt)< 0) {
            fract1Resalt = String.valueOf(Integer.parseInt(fract1Resalt) * -1);
            znakResalt = "-";
        }
        if(Integer.parseInt(fract1Resalt) >= Integer.parseInt(fract2Resalt)) {
            if(!integerResalt.equals(""))
                integerResalt = String.valueOf(Integer.parseInt(integerResalt) + Integer.parseInt(fract1Resalt) / Integer.parseInt(fract2Resalt));
            else
                integerResalt = String.valueOf(Integer.parseInt(fract1Resalt) / Integer.parseInt(fract2Resalt));
            if(Integer.parseInt(fract1Resalt) % Integer.parseInt(fract2Resalt)!= 0)
                fract1Resalt = String.valueOf(Integer.parseInt(fract1Resalt) % Integer.parseInt(fract2Resalt));
            else {
                fract1Resalt="";
                fract2Resalt="";
            }
        }
        if(fract1Resalt.equals("0")){
            if(integerResalt.equals("")) {
                integerResalt = "0";
            }
            fract1Resalt = "";
            fract2Resalt = "";
        }
        if(!fract1Resalt.equals("") && !fract2Resalt.equals("")) {
            int i = 9;
            while (i > 0) {
                if (Integer.parseInt(fract1Resalt) % i == 0 && Integer.parseInt(fract2Resalt) % i == 0) {
                    fract1Resalt = String.valueOf(Integer.parseInt(fract1Resalt) / i);
                    fract2Resalt = String.valueOf(Integer.parseInt(fract2Resalt) / i);
                }
                i--;
            }
        }
    }

    public String getInteger1() {
        return integer1;
    }

    public void setInteger1(String integer1) {
        this.integer1 = integer1;
    }

    public String getInteger2() {
        return integer2;
    }

    public void setInteger2(String integer2) {
        this.integer2 = integer2;
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }

    public String getRawno() {
        return rawno;
    }

    public void setRawno(String rawno) {
        this.rawno = rawno;
    }

    public String getFract11() {
        return fract11;
    }

    public void setFract11(String fract11) {
        this.fract11 = fract11;
    }

    public String getFract12() {
        return fract12;
    }

    public void setFract12(String fract12) {
        this.fract12 = fract12;
    }

    public String getFract21() {
        return fract21;
    }

    public void setFract21(String fract21) {
        this.fract21 = fract21;
    }

    public String getFract22() {
        return fract22;
    }

    public void setFract22(String fract22) {
        this.fract22 = fract22;
    }


}
