//package enums;
//
//public class baseClass {
//    public static void main(String[] args) {
//        enums.enums.Day day;
//
//        // Constructor
//    public baseClass(Day day) {
//            this.day = day;
//        }
//
//        // Prints a line about Day using switch
//        public void dayIsLike() {
//            switch (day) {
//                case MONDAY:
//                    System.out.println("Mondays are bad.");
//                    break;
//                case FRIDAY:
//                    System.out.println("Fridays are better.");
//                    break;
//                case SATURDAY:
//                case SUNDAY:
//                    System.out.println("Weekends are best.");
//                    break;
//                default:
//                    System.out.println("Midweek days are so-so.");
//                    break;
//            }
//        }
//
//        // Driver method
//        public static void main(String[] args) {
//            String str = "MONDAY";
//            baseClass t1 = new baseClass(enums.enums.Day.valueOf(str));
//            t1.dayIsLike();
//        }
//    }
//}
