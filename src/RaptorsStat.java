import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class RaptorsStat {
    public static void main(String[] args) throws Exception {
        Scanner gameChoice = new Scanner(System.in);
        System.out.print("Enter game number you want: ");
        String gameNumber = gameChoice.nextLine();// user input
        File file = new File("games/game" + gameNumber + ".txt");
        Scanner scan = new Scanner(file);
        Scanner mapScan = new Scanner(file);
        int i =1;
        File file1= new File("games/game" + i + ".txt");
        Scanner seasonMapScan = new Scanner(file1);
        //Scanner scan1 = new Scanner(scan);
        //scan1.useDelimiter(",");
        Map<String, String[]> map = new HashMap<>();
        Map<String, String[]> seasonMap = new HashMap<>();

        //game map stats builder
        while (mapScan.hasNext()) {
            String stats = mapScan.nextLine();
            Scanner scanLine = new Scanner(stats);
            scanLine.useDelimiter(",");
            String name = scanLine.next();
            String team = scanLine.next();
            if (team.equals("TOR") && !map.containsKey(name)) {
                map.put(name, new String[]{"0", "0", "0", "0", "0", "0"});
            }

        }

        //season map stats builder
        while (seasonMapScan.hasNext()) {
            String stats = seasonMapScan.nextLine();
            Scanner scanLine = new Scanner(stats);
            scanLine.useDelimiter(",");
            String name = scanLine.next();
            String team = scanLine.next();
            if (team.equals("TOR") && !seasonMap.containsKey(name)) {
                seasonMap.put(name, new String[]{"0", "0", "0", "0", "0", "0"});
            }

        }

        //game stats calculator
        while (scan.hasNext()) {
            String stats = scan.nextLine();
            Scanner scanLine = new Scanner(stats);
            scanLine.useDelimiter(",");
            String name = scanLine.next();
            String team = scanLine.next();
            String shotType = scanLine.next();
            String shotAmount = scanLine.next();

            switch (name) {
                case ("K. Leonard"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("K. Leonard")[0] = Double.toString(Double.parseDouble(map.get("K. Leonard")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("K. Leonard")[1] = Double.toString(Double.parseDouble(map.get("K. Leonard")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("K. Leonard")[2] = Double.toString(Double.parseDouble(map.get("K. Leonard")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("K. Leonard")[3] = Double.toString(Double.parseDouble(map.get("K. Leonard")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("K. Leonard")[4] = Double.toString(Double.parseDouble(map.get("K. Leonard")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("K. Leonard")[5] = Double.toString(Double.parseDouble(map.get("K. Leonard")[5]) + 3);
                    }
                    break;
                case ("O. Anunoby"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("O. Anunoby")[0] = Double.toString(Double.parseDouble(map.get("O. Anunoby")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("O. Anunoby")[1] = Double.toString(Double.parseDouble(map.get("O. Anunoby")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("O. Anunoby")[2] = Double.toString(Double.parseDouble(map.get("O. Anunoby")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("O. Anunoby")[3] = Double.toString(Double.parseDouble(map.get("O. Anunoby")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("O. Anunoby")[4] = Double.toString(Double.parseDouble(map.get("O. Anunoby")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("O. Anunoby")[5] = Double.toString(Double.parseDouble(map.get("O. Anunoby")[5]) + 3);
                    }
                    break;
                case ("K. Lowry"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("K. Lowry")[0] = Double.toString(Double.parseDouble(map.get("K. Lowry")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("K. Lowry")[1] = Double.toString(Double.parseDouble(map.get("K. Lowry")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("K. Lowry")[2] = Double.toString(Double.parseDouble(map.get("K. Lowry")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("K. Lowry")[3] = Double.toString(Double.parseDouble(map.get("K. Lowry")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("K. Lowry")[4] = Double.toString(Double.parseDouble(map.get("K. Lowry")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("K. Lowry")[5] = Double.toString(Double.parseDouble(map.get("K. Lowry")[5]) + 3);
                    }
                    break;
                case ("D. Green"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("D. Green")[0] = Double.toString(Double.parseDouble(map.get("D. Green")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("D. Green")[1] = Double.toString(Double.parseDouble(map.get("D. Green")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("D. Green")[2] = Double.toString(Double.parseDouble(map.get("D. Green")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("D. Green")[3] = Double.toString(Double.parseDouble(map.get("D. Green")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("D. Green")[4] = Double.toString(Double.parseDouble(map.get("D. Green")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("D. Green")[5] = Double.toString(Double.parseDouble(map.get("D. Green")[5]) + 3);
                    }
                    break;
                case ("F. VanVleet"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("F. VanVleet")[0] = Double.toString(Double.parseDouble(map.get("F. VanVleet")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("F. VanVleet")[1] = Double.toString(Double.parseDouble(map.get("F. VanVleet")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("F. VanVleet")[2] = Double.toString(Double.parseDouble(map.get("F. VanVleet")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("F. VanVleet")[3] = Double.toString(Double.parseDouble(map.get("F. VanVleet")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("F. VanVleet")[4] = Double.toString(Double.parseDouble(map.get("F. VanVleet")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("F. VanVleet")[5] = Double.toString(Double.parseDouble(map.get("F. VanVleet")[5]) + 3);
                    }
                    break;
                case ("J. Valanciunas"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("J. Valanciunas")[0] = Double.toString(Double.parseDouble(map.get("J. Valanciunas")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("J. Valanciunas")[1] = Double.toString(Double.parseDouble(map.get("J. Valanciunas")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("J. Valanciunas")[2] = Double.toString(Double.parseDouble(map.get("J. Valanciunas")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("J. Valanciunas")[3] = Double.toString(Double.parseDouble(map.get("J. Valanciunas")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("J. Valanciunast")[4] = Double.toString(Double.parseDouble(map.get("J. Valanciunas")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("J. Valanciunas")[5] = Double.toString(Double.parseDouble(map.get("J. Valanciunas")[5]) + 3);
                    }
                    break;
                case ("P. Siakam"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("P. Siakam")[0] = Double.toString(Double.parseDouble(map.get("P. Siakam")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("P. Siakam")[1] = Double.toString(Double.parseDouble(map.get("P. Siakam")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("P. Siakam")[2] = Double.toString(Double.parseDouble(map.get("P. Siakam")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("P. Siakam")[3] = Double.toString(Double.parseDouble(map.get("P. Siakam")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("P. Siakam")[4] = Double.toString(Double.parseDouble(map.get("P. Siakam")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("P. Siakam")[5] = Double.toString(Double.parseDouble(map.get("P. Siakam")[5]) + 3);
                    }
                    break;
                case ("N. Powell"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("N. Powell")[0] = Double.toString(Double.parseDouble(map.get("N. Powell")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("N. Powell")[1] = Double.toString(Double.parseDouble(map.get("N. Powell")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("N. Powell")[2] = Double.toString(Double.parseDouble(map.get("N. Powell")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("N. Powell")[3] = Double.toString(Double.parseDouble(map.get("N. Powell")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("N. Powell")[4] = Double.toString(Double.parseDouble(map.get("N. Powell")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("N. Powell")[5] = Double.toString(Double.parseDouble(map.get("N. Powell")[5]) + 3);
                    }
                    break;
                case ("S. Ibaka"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("S. Ibaka")[0] = Double.toString(Double.parseDouble(map.get("S. Ibaka")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("S. Ibaka")[1] = Double.toString(Double.parseDouble(map.get("S. Ibaka")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("S. Ibaka")[2] = Double.toString(Double.parseDouble(map.get("S. Ibaka")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("S. Ibaka")[3] = Double.toString(Double.parseDouble(map.get("S. Ibaka")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("S. Ibaka")[4] = Double.toString(Double.parseDouble(map.get("S. Ibaka")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("S. Ibaka")[5] = Double.toString(Double.parseDouble(map.get("S. Ibaka")[5]) + 3);
                    }
                    break;
                case ("C. Miles"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("C. Miles")[0] = Double.toString(Double.parseDouble(map.get("C. Miles")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("C. Miles")[1] = Double.toString(Double.parseDouble(map.get("C. Miles")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("C. Miles")[2] = Double.toString(Double.parseDouble(map.get("C. Miles")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("C. Miles")[3] = Double.toString(Double.parseDouble(map.get("C. Miles")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("C. Miles")[4] = Double.toString(Double.parseDouble(map.get("C. Miles")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("C. Miles")[5] = Double.toString(Double.parseDouble(map.get("C. Miles")[5]) + 3);
                    }
                    break;
                case ("D. Wright"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("D. Wright")[0] = Double.toString(Double.parseDouble(map.get("D. Wright")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("D. Wright")[1] = Double.toString(Double.parseDouble(map.get("D. Wright")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("D. Wright")[2] = Double.toString(Double.parseDouble(map.get("D. Wright")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("D. Wright")[3] = Double.toString(Double.parseDouble(map.get("D. Wright")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("D. Wright")[4] = Double.toString(Double.parseDouble(map.get("D. Wright")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("D. Wright")[5] = Double.toString(Double.parseDouble(map.get("D. Wright")[5]) + 3);
                    }
                    break;
                case ("G. Monroe"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("G. Monroe")[0] = Double.toString(Double.parseDouble(map.get("G. Monroe")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("G. Monroe")[1] = Double.toString(Double.parseDouble(map.get("G. Monroe")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("G. Monroe")[2] = Double.toString(Double.parseDouble(map.get("G. Monroe")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("G. Monroe")[3] = Double.toString(Double.parseDouble(map.get("G. Monroe")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("G. Monroe")[4] = Double.toString(Double.parseDouble(map.get("G. Monroe")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("G. Monroe")[5] = Double.toString(Double.parseDouble(map.get("G. Monroe")[5]) + 3);
                    }
                    break;
                case ("P. McCaw"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("P. McCaw")[0] = Double.toString(Double.parseDouble(map.get("P. McCaw")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("P. McCaw")[1] = Double.toString(Double.parseDouble(map.get("P. McCaw")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("P. McCaw")[2] = Double.toString(Double.parseDouble(map.get("P. McCaw")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("P. McCaw")[3] = Double.toString(Double.parseDouble(map.get("P. McCaw")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("P. McCaw")[4] = Double.toString(Double.parseDouble(map.get("P. McCaw")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("P. McCaw")[5] = Double.toString(Double.parseDouble(map.get("P. McCaw")[5]) + 3);
                    }
                    break;
                case ("J. Lin"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("J. Lin")[0] = Double.toString(Double.parseDouble(map.get("J. Lin")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("J. Lin")[1] = Double.toString(Double.parseDouble(map.get("J. Lin")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("J. Lin")[2] = Double.toString(Double.parseDouble(map.get("J. Lin")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("J. Lin")[3] = Double.toString(Double.parseDouble(map.get("J. Lin")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("J. Lin")[4] = Double.toString(Double.parseDouble(map.get("J. Lin")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("J. Lin")[5] = Double.toString(Double.parseDouble(map.get("J. Lin")[5]) + 3);
                    }
                    break;
                case ("M. Gasol"):
                    if (shotType.equals("make") && shotAmount.equals("1")) {
                        map.get("M. Gasol")[0] = Double.toString(Double.parseDouble(map.get("M. Gasol")[0]) + 1);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("1")) {
                        map.get("M. Gasol")[1] = Double.toString(Double.parseDouble(map.get("M. Gasol")[1]) + 1);
                    }
                    if (shotType.equals("make") && shotAmount.equals("2")) {
                        map.get("M. Gasol")[2] = Double.toString(Double.parseDouble(map.get("M. Gasol")[2]) + 2);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("2")) {
                        map.get("M. Gasol")[3] = Double.toString(Double.parseDouble(map.get("M. Gasol")[3]) + 2);
                    }
                    if (shotType.equals("make") && shotAmount.equals("3")) {
                        map.get("M. Gasol")[4] = Double.toString(Double.parseDouble(map.get("M. Gasol")[4]) + 3);
                    }
                    if (shotType.equals("miss") && shotAmount.equals("3")) {
                        map.get("M. Gasol")[5] = Double.toString(Double.parseDouble(map.get("M. Gasol")[5]) + 3);
                    }
                    break;






            }

        }

        //Season stats calculator
        for (i = 1; i <= 82; i++) {
            file1 = new File("games/game" + Integer.toString(i) + ".txt");
            Scanner seasonScanner = new Scanner(file1);
            while (seasonScanner.hasNext()) {
                String stats = seasonScanner.nextLine();
                Scanner scanLine = new Scanner(stats);
                scanLine.useDelimiter(",");
                String name = scanLine.next();
                String team = scanLine.next();
                String shotType = scanLine.next();
                String shotAmount = scanLine.next();

                switch (name) {
                    case ("K. Leonard"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("K. Leonard")[0] = Double.toString(Double.parseDouble(seasonMap.get("K. Leonard")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("K. Leonard")[1] = Double.toString(Double.parseDouble(seasonMap.get("K. Leonard")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("K. Leonard")[2] = Double.toString(Double.parseDouble(seasonMap.get("K. Leonard")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("K. Leonard")[3] = Double.toString(Double.parseDouble(seasonMap.get("K. Leonard")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("K. Leonard")[4] = Double.toString(Double.parseDouble(seasonMap.get("K. Leonard")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("K. Leonard")[5] = Double.toString(Double.parseDouble(seasonMap.get("K. Leonard")[5]) + 3);
                        }
                        break;
                   case ("O. Anunoby"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("O. Anunoby")[0] = Double.toString(Double.parseDouble( seasonMap.get("O. Anunoby")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("O. Anunoby")[1] = Double.toString(Double.parseDouble( seasonMap.get("O. Anunoby")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("O. Anunoby")[2] = Double.toString(Double.parseDouble( seasonMap.get("O. Anunoby")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("O. Anunoby")[3] = Double.toString(Double.parseDouble( seasonMap.get("O. Anunoby")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("O. Anunoby")[4] = Double.toString(Double.parseDouble( seasonMap.get("O. Anunoby")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("O. Anunoby")[5] = Double.toString(Double.parseDouble( seasonMap.get("O. Anunoby")[5]) + 3);
                        }
                        break;
                     case ("K. Lowry"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("K. Lowry")[0] = Double.toString(Double.parseDouble( seasonMap.get("K. Lowry")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("K. Lowry")[1] = Double.toString(Double.parseDouble( seasonMap.get("K. Lowry")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("K. Lowry")[2] = Double.toString(Double.parseDouble( seasonMap.get("K. Lowry")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("K. Lowry")[3] = Double.toString(Double.parseDouble( seasonMap.get("K. Lowry")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("K. Lowry")[4] = Double.toString(Double.parseDouble( seasonMap.get("K. Lowry")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("K. Lowry")[5] = Double.toString(Double.parseDouble( seasonMap.get("K. Lowry")[5]) + 3);
                        }
                        break;
                    case ("D. Green"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("D. Green")[0] = Double.toString(Double.parseDouble( seasonMap.get("D. Green")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("D. Green")[1] = Double.toString(Double.parseDouble( seasonMap.get("D. Green")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("D. Green")[2] = Double.toString(Double.parseDouble( seasonMap.get("D. Green")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("D. Green")[3] = Double.toString(Double.parseDouble( seasonMap.get("D. Green")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("D. Green")[4] = Double.toString(Double.parseDouble( seasonMap.get("D. Green")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("D. Green")[5] = Double.toString(Double.parseDouble( seasonMap.get("D. Green")[5]) + 3);
                        }
                        break;
                    case ("F. VanVleet"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("F. VanVleet")[0] = Double.toString(Double.parseDouble( seasonMap.get("F. VanVleet")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("F. VanVleet")[1] = Double.toString(Double.parseDouble( seasonMap.get("F. VanVleet")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("F. VanVleet")[2] = Double.toString(Double.parseDouble( seasonMap.get("F. VanVleet")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("F. VanVleet")[3] = Double.toString(Double.parseDouble( seasonMap.get("F. VanVleet")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("F. VanVleet")[4] = Double.toString(Double.parseDouble( seasonMap.get("F. VanVleet")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("F. VanVleet")[5] = Double.toString(Double.parseDouble( seasonMap.get("F. VanVleet")[5]) + 3);
                        }
                        break;
                    case ("J. Valanciunas"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("J. Valanciunas")[0] = Double.toString(Double.parseDouble( seasonMap.get("J. Valanciunas")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("J. Valanciunas")[1] = Double.toString(Double.parseDouble( seasonMap.get("J. Valanciunas")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("J. Valanciunas")[2] = Double.toString(Double.parseDouble( seasonMap.get("J. Valanciunas")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("J. Valanciunas")[3] = Double.toString(Double.parseDouble( seasonMap.get("J. Valanciunas")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("J. Valanciunas")[4] = Double.toString(Double.parseDouble( seasonMap.get("J. Valanciunas")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("J. Valanciunas")[5] = Double.toString(Double.parseDouble( seasonMap.get("J. Valanciunas")[5]) + 3);
                        }
                        break;
                    case ("P. Siakam"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("P. Siakam")[0] = Double.toString(Double.parseDouble( seasonMap.get("P. Siakam")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("P. Siakam")[1] = Double.toString(Double.parseDouble( seasonMap.get("P. Siakam")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("P. Siakam")[2] = Double.toString(Double.parseDouble( seasonMap.get("P. Siakam")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("P. Siakam")[3] = Double.toString(Double.parseDouble( seasonMap.get("P. Siakam")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("P. Siakam")[4] = Double.toString(Double.parseDouble( seasonMap.get("P. Siakam")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("P. Siakam")[5] = Double.toString(Double.parseDouble( seasonMap.get("P. Siakam")[5]) + 3);
                        }
                        break;
                    case ("N. Powell"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("N. Powell")[0] = Double.toString(Double.parseDouble( seasonMap.get("N. Powell")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("N. Powell")[1] = Double.toString(Double.parseDouble( seasonMap.get("N. Powell")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("N. Powell")[2] = Double.toString(Double.parseDouble( seasonMap.get("N. Powell")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("N. Powell")[3] = Double.toString(Double.parseDouble( seasonMap.get("N. Powell")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("N. Powell")[4] = Double.toString(Double.parseDouble( seasonMap.get("N. Powell")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("N. Powell")[5] = Double.toString(Double.parseDouble( seasonMap.get("N. Powell")[5]) + 3);
                        }
                        break;
                    case ("S. Ibaka"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("S. Ibaka")[0] = Double.toString(Double.parseDouble( seasonMap.get("S. Ibaka")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("S. Ibaka")[1] = Double.toString(Double.parseDouble( seasonMap.get("S. Ibaka")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("S. Ibaka")[2] = Double.toString(Double.parseDouble( seasonMap.get("S. Ibaka")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("S. Ibaka")[3] = Double.toString(Double.parseDouble( seasonMap.get("S. Ibaka")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("S. Ibaka")[4] = Double.toString(Double.parseDouble( seasonMap.get("S. Ibaka")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("S. Ibaka")[5] = Double.toString(Double.parseDouble( seasonMap.get("S. Ibaka")[5]) + 3);
                        }
                        break;
                    case ("C. Miles"):
                        if (shotType.equals("make") && shotAmount.equals("1")) {
                            seasonMap.get("C. Miles")[0] = Double.toString(Double.parseDouble( seasonMap.get("C. Miles")[0]) + 1);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("1")) {
                            seasonMap.get("C. Miles")[1] = Double.toString(Double.parseDouble( seasonMap.get("C. Miles")[1]) + 1);
                        }
                        if (shotType.equals("make") && shotAmount.equals("2")) {
                            seasonMap.get("C. Miles")[2] = Double.toString(Double.parseDouble( seasonMap.get("C. Miles")[2]) + 2);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("2")) {
                            seasonMap.get("C. Miles")[3] = Double.toString(Double.parseDouble( seasonMap.get("C. Miles")[3]) + 2);
                        }
                        if (shotType.equals("make") && shotAmount.equals("3")) {
                            seasonMap.get("C. Miles")[4] = Double.toString(Double.parseDouble( seasonMap.get("C. Miles")[4]) + 3);
                        }
                        if (shotType.equals("miss") && shotAmount.equals("3")) {
                            seasonMap.get("C. Miles")[5] = Double.toString(Double.parseDouble( seasonMap.get("C. Miles")[5]) + 3);
                        }
                        break;

                    default: ; break;



                }
            }
        }
        System.out.println("K. Lowry  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("K. Lowry")[0]) / ((Double.parseDouble(map.get("K. Lowry")[0]) + Double.parseDouble(map.get("K. Lowry")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("K. Lowry")[2]) / ((Double.parseDouble(map.get("K. Lowry")[2]) + Double.parseDouble(map.get("K. Lowry")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("K. Lowry")[4]) / ((Double.parseDouble(map.get("K. Lowry")[4]) + Double.parseDouble(map.get("K. Lowry")[5])))));
        System.out.println("K. Leonard  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("K. Leonard")[0]) / ((Double.parseDouble(map.get("K. Leonard")[0]) + Double.parseDouble(map.get("K. Leonard")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("K. Leonard")[2]) / ((Double.parseDouble(map.get("K. Leonard")[2]) + Double.parseDouble(map.get("K. Leonard")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("K. Leonard")[4]) / ((Double.parseDouble(map.get("K. Leonard")[4]) + Double.parseDouble(map.get("K. Leonard")[5])))));
        System.out.println("O. Anunoby  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("O. Anunoby")[0]) / ((Double.parseDouble(map.get("O. Anunoby")[0]) + Double.parseDouble(map.get("O. Anunoby")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("O. Anunoby")[2]) / ((Double.parseDouble(map.get("O. Anunoby")[2]) + Double.parseDouble(map.get("O. Anunoby")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("O. Anunoby")[4]) / ((Double.parseDouble(map.get("O. Anunoby")[4]) + Double.parseDouble(map.get("O. Anunoby")[5])))));
        System.out.println("D. Green  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("D. Green")[0]) / ((Double.parseDouble(map.get("D. Green")[0]) + Double.parseDouble(map.get("D. Green")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("D. Green")[2]) / ((Double.parseDouble(map.get("D. Green")[2]) + Double.parseDouble(map.get("D. Green")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("D. Green")[4]) / ((Double.parseDouble(map.get("D. Green")[4]) + Double.parseDouble(map.get("D. Green")[5])))));
        System.out.println("F. VanVleet  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("F. VanVleet")[0]) / ((Double.parseDouble(map.get("F. VanVleet")[0]) + Double.parseDouble(map.get("F. VanVleet")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("F. VanVleet")[2]) / ((Double.parseDouble(map.get("F. VanVleet")[2]) + Double.parseDouble(map.get("F. VanVleet")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("F. VanVleet")[4]) / ((Double.parseDouble(map.get("F. VanVleet")[4]) + Double.parseDouble(map.get("F. VanVleet")[5])))));
        System.out.println("J. Valanciunas  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("J. Valanciunas")[0]) / ((Double.parseDouble(map.get("J. Valanciunas")[0]) + Double.parseDouble(map.get("J. Valanciunas")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("J. Valanciunas")[2]) / ((Double.parseDouble(map.get("J. Valanciunas")[2]) + Double.parseDouble(map.get("J. Valanciunas")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("J. Valanciunas")[4]) / ((Double.parseDouble(map.get("J. Valanciunas")[4]) + Double.parseDouble(map.get("J. Valanciunas")[5])))));
        System.out.println("P. Siakam  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("P. Siakam")[0]) / ((Double.parseDouble(map.get("P. Siakam")[0]) + Double.parseDouble(map.get("P. Siakam")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("P. Siakam")[2]) / ((Double.parseDouble(map.get("P. Siakam")[2]) + Double.parseDouble(map.get("P. Siakam")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("P. Siakam")[4]) / ((Double.parseDouble(map.get("P. Siakam")[4]) + Double.parseDouble(map.get("P. Siakam")[5])))));
        System.out.println("N. Powell  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("N. Powell")[0]) / ((Double.parseDouble(map.get("N. Powell")[0]) + Double.parseDouble(map.get("N. Powell")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("N. Powell")[2]) / ((Double.parseDouble(map.get("N. Powell")[2]) + Double.parseDouble(map.get("N. Powell")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("N. Powell")[4]) / ((Double.parseDouble(map.get("N. Powell")[4]) + Double.parseDouble(map.get("N. Powell")[5])))));
        System.out.println("S. Ibaka  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("S. Ibaka")[0]) / ((Double.parseDouble(map.get("S. Ibaka")[0]) + Double.parseDouble(map.get("S. Ibaka")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("S. Ibaka")[2]) / ((Double.parseDouble(map.get("S. Ibaka")[2]) + Double.parseDouble(map.get("S. Ibaka")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("S. Ibaka")[4]) / ((Double.parseDouble(map.get("S. Ibaka")[4]) + Double.parseDouble(map.get("S. Ibaka")[5])))));
        System.out.println("C. Miles  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("C. Miles")[0]) / ((Double.parseDouble(map.get("C. Miles")[0]) + Double.parseDouble(map.get("C. Miles")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("C. Miles")[2]) / ((Double.parseDouble(map.get("C. Miles")[2]) + Double.parseDouble(map.get("C. Miles")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("C. Miles")[4]) / ((Double.parseDouble(map.get("C. Miles")[4]) + Double.parseDouble(map.get("C. Miles")[5])))));
        System.out.println("G. Monroe  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("G. Monroe")[0]) / ((Double.parseDouble(map.get("G. Monroe")[0]) + Double.parseDouble(map.get("G. Monroe")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("G. Monroe")[2]) / ((Double.parseDouble(map.get("G. Monroet")[2]) + Double.parseDouble(map.get("G. Monroe")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("G. Monroe")[4]) / ((Double.parseDouble(map.get("G. Monroet")[4]) + Double.parseDouble(map.get("G. Monroe")[5])))));
        System.out.println("P. McCaw stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("P. McCaw")[0]) / ((Double.parseDouble(map.get("P. McCaw")[0]) + Double.parseDouble(map.get("P. McCaw")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("P. McCaw")[2]) / ((Double.parseDouble(map.get("P. McCaw")[2]) + Double.parseDouble(map.get("P. McCaw")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("P. McCaw")[4]) / ((Double.parseDouble(map.get("P. McCaw")[4]) + Double.parseDouble(map.get("P. McCaw")[5])))));
        System.out.println("J. Lin  stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("J. Lin")[0]) / ((Double.parseDouble(map.get("J. Lin")[0]) + Double.parseDouble(map.get("J. Lin")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("J. Lint")[2]) / ((Double.parseDouble(map.get("J. Lin")[2]) + Double.parseDouble(map.get("J. Lin")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("J. Lin")[4]) / ((Double.parseDouble(map.get("J. Lin")[4]) + Double.parseDouble(map.get("J. Lin")[5])))));
        System.out.println("M. Gasol stats: ");
        System.out.println("Freethrow percentage: " + (Double.parseDouble(map.get("M. Gasol")[0]) / ((Double.parseDouble(map.get("M. Gasol")[0]) + Double.parseDouble(map.get("M. Gasol")[1])))));
        System.out.println("Field goal percentage " +(Double.parseDouble(map.get("M. Gasol")[2]) / ((Double.parseDouble(map.get("M. Gasol")[2]) + Double.parseDouble(map.get("M. Gasol")[3])))));
        System.out.println("Three point percentage: " + (Double.parseDouble(map.get("M. Gasol")[4]) / ((Double.parseDouble(map.get("M. Gasol")[4]) + Double.parseDouble(map.get("M. Gasol")[5])))));












        if(gameNumber.equals("82")){//if game selected is 82, compute the stat for the whole season
            System.out.println(" Season Stats for K. Leonard");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get("K. Leonard")[0]) /(Double.parseDouble(seasonMap.get("K. Leonard")[0]) + Double.parseDouble(seasonMap.get("K. Leonard")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get("K. Leonard")[2]) /(Double.parseDouble(seasonMap.get("K. Leonard")[2]) + Double.parseDouble(seasonMap.get("K. Leonard")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get("K. Leonard")[4]) /(Double.parseDouble(seasonMap.get("K. Leonard")[4]) + Double.parseDouble(seasonMap.get("K. Leonard")[5]))) );
            System.out.println("Season Stats for O. Anunoby");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get("O. Anunoby")[0]) /(Double.parseDouble(seasonMap.get("O. Anunoby")[0]) + Double.parseDouble(seasonMap.get("O. Anunoby")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get("O. Anunoby")[2]) /(Double.parseDouble(seasonMap.get("O. Anunoby")[2]) + Double.parseDouble(seasonMap.get("O. Anunoby")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get("O. Anunoby")[4]) /(Double.parseDouble(seasonMap.get("O. Anunoby")[4]) + Double.parseDouble(seasonMap.get("O. Anunoby")[5]))) );
            System.out.println("Season Stats for J. Valanciunas ");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get("J. Valanciunas")[0]) /(Double.parseDouble(seasonMap.get("J. Valanciunas")[0]) + Double.parseDouble(seasonMap.get("J. Valanciunas")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get("J. Valanciunas")[2]) /(Double.parseDouble(seasonMap.get("J. Valanciunas")[2]) + Double.parseDouble(seasonMap.get("J. Valanciunas")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get("J. Valanciunas")[4]) /(Double.parseDouble(seasonMap.get("J. Valanciunas")[4]) + Double.parseDouble(seasonMap.get("J. Valanciunas")[5]))) );
            System.out.println("Season Stats for D. Green");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get("D. Green")[0]) /(Double.parseDouble(seasonMap.get("D. Green")[0]) + Double.parseDouble(seasonMap.get("D. Green")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get("D. Green")[2]) /(Double.parseDouble(seasonMap.get("D. Green")[2]) + Double.parseDouble(seasonMap.get("D. Green")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get("D. Green")[4]) /(Double.parseDouble(seasonMap.get("D. Green")[4]) + Double.parseDouble(seasonMap.get("D. Green")[5]))) );
            System.out.println("Season Stats for P. Siakam ");

            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get("P. Siakam")[0]) /(Double.parseDouble(seasonMap.get("P. Siakam")[0]) + Double.parseDouble(seasonMap.get("P. Siakam")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get("P. Siakam")[2]) /(Double.parseDouble(seasonMap.get("P. Siakam")[2]) + Double.parseDouble(seasonMap.get("P. Siakam")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get("P. Siakam")[4]) /(Double.parseDouble(seasonMap.get("P. Siakam")[4]) + Double.parseDouble(seasonMap.get("P. Siakam")[5]))) );
            System.out.println("Season Stats for K.Lowry ");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get("K. Lowry")[0]) /(Double.parseDouble(seasonMap.get("K. Lowry")[0]) + Double.parseDouble(seasonMap.get("K. Lowry")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get("K. Lowry")[2]) /(Double.parseDouble(seasonMap.get("K. Lowry")[2]) + Double.parseDouble(seasonMap.get("K. Lowry")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get("K. Lowry")[4]) /(Double.parseDouble(seasonMap.get("K. Lowry")[4]) + Double.parseDouble(seasonMap.get("K. Lowry")[5]))) );
            System.out.println("Season Stats for F. VanVleet");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get("F. VanVleet")[0]) /(Double.parseDouble(seasonMap.get("F. VanVleet")[0]) + Double.parseDouble(seasonMap.get("F. VanVleet")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get("F. VanVleet")[2]) /(Double.parseDouble(seasonMap.get("F. VanVleet")[2]) + Double.parseDouble(seasonMap.get("F. VanVleet")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get("F. VanVleet")[4]) /(Double.parseDouble(seasonMap.get("F. VanVleet")[4]) + Double.parseDouble(seasonMap.get("F. VanVleet")[5]))) );
            System.out.println("Season Stats for S. Ibaka");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get(" S. Ibaka")[0]) /(Double.parseDouble(seasonMap.get(" S. Ibaka")[0]) + Double.parseDouble(seasonMap.get(" S. Ibaka")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get(" S. Ibaka")[2]) /(Double.parseDouble(seasonMap.get(" S. Ibaka")[2]) + Double.parseDouble(seasonMap.get(" S. Ibaka")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get(" S. Ibaka")[4]) /(Double.parseDouble(seasonMap.get(" S. Ibaka")[4]) + Double.parseDouble(seasonMap.get(" S. Ibaka")[5]))) );
            System.out.println("Season Stats for C. Miles");
            System.out.println("Freethrow percentage = " +   (Double.parseDouble(seasonMap.get(" C. Miles")[0]) /(Double.parseDouble(seasonMap.get(" C. Miles")[0]) + Double.parseDouble(seasonMap.get(" C. Miles")[1]))) ) ;
            System.out.println(" Field goal percentage = " + (Double.parseDouble(seasonMap.get(" C. Miles")[2]) /(Double.parseDouble(seasonMap.get(" C. Miles")[2]) + Double.parseDouble(seasonMap.get(" C. Miles")[3]))) );
            System.out.println("Threepoint percentage =  " + (Double.parseDouble(seasonMap.get(" C. Miles")[4]) /(Double.parseDouble(seasonMap.get(" C. Miles")[4]) + Double.parseDouble(seasonMap.get(" C. Miles")[5]))) );





        }

    }
    }


