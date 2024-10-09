public class App {
    public static void main(String[] args) throws Exception {
            int year = 2024;
            int month = 3;
            int day = 6;
    
            if (year < 0 || year > 9999) {
                System.out.println("Année invalidation. elle doit être 0 et 9999.");
                boolean dayValid = false;
                switch (month) {
                    case 2:
                        if (year % 4 == 0 && day == 29) {
                            dayValid = true;
                        } else if (day >= 1 && day <= 28) {
                            dayValid = true;
                        } else {
                            dayValid = false;
                        }
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (day >= 1 && day <= 31) {
                            dayValid = true;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (day >= 1 && day <= 30) {
                            dayValid = true;
                        }
                        break;
                    default:
                        System.out.println("le mois [" + month + "] est invalide");
                }
                if (!dayValid) {
                    System.out.println("jour invalide pour ce mois.");
                } else {
                    String monthText = "";
                    switch (month) {
                        case 1:
                            monthText = "Janvier";
                            break;
                        case 2:
                            monthText = "Février";
                            break;
                        case 3:
                            monthText = "Mars";
                            break;
                        case 4:
                            monthText = "Avril";
                            break;
                        case 5:
                            monthText = "Mai";
                            break;
                        case 6:
                            monthText = "Juin";
                            break;
                        case 7:
                            monthText = "Juillet";
                            break;
                        case 8:
                            monthText = "Août";
                            break;
                        case 9:
                            monthText = "Septembre";
                            break;
                        case 10:
                            monthText = "Octobre";
                            break;
                        case 11:
                            monthText = "Novembre";
                            break;
                        case 12:
                            monthText = "Décembre";
                            break;
                    }
                    System.out.println("La date est : " + day + " " + monthText + " " + year);
                }
            }
        }
    }
