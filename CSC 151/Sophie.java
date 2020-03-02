class Sophie {

     

        public static void main(String[] args) {

    

            String s = "Java";

            StringBuilder buffer = new StringBuilder(s);

            change(buffer);

            System.out.println(buffer);

        } 

    

       public static void change(StringBuilder sbval) { 

           sbval.append(" and HTML"); 

       } 

    

   } 