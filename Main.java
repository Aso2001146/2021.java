public class Main{
    public static void main(String[] args){
        Scanner sanner = new Scanner(System.in);

        int count = 0;
        int bru = 1;

        //タイトル
        System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        System.out.println("         戦艦ゲーム          ");
        System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");

        int[][] a = new int[7][7];

        for(int p = 1 ; p < 100 ; p++){
            if(bru == 4){

                Ship ship = new Ship();
                ship.lastdisp();
                break;
            }
            for(int i = 1 ; i < 6 ; j++){
                for(int j = 1 ; j < 6 ; j++){
                    a[i][j] = 0;
                }
            }

            if(bru == 1){
                for(int x = 0 ; x < 3 ; x++){
                    Random rnd = new Random();
                    int b = rnd.nextInt(5) + 1;
                    int c = rnd.nextInt(5) + 1;
                    a[b][c] = 1;
                }
            }else if(bru == 2){
                 for(int x = 0 ; x < 2 ; x++){
                    Random rnd = new Random();
                    int b = rnd.nextInt(5) + 1;
                    int c = rnd.nextInt(5) + 1;
                    a[b][c] = 1;
                }
            }else if(bru == 3){
                for(int x = 0 ; x < 1 ; x++){
                    Random rnd = new Random();
                    int b = rnd.nextInt(5) + 1;
                    int c = rnd.nextInt(5) + 1;
                    a[b][c] = 1;
                }
            }
            for(int i = 1 ; i < 6 ; j++){
                for(int j = 1 ; j < 6 ; j++){
                    System.out.print(a[i][j]);
                }else{
                    System.out.print(a[i][j]);
                    System.out.println("");
                }
            }
        }
        for(int g = 0 ; g <= 100 ; g++){
            System.out.println("---ターン" + p + "---");
            System.out.println("X座標を1~5で選んでください");
            String d = scanner.next();
            System.out.println("Y座標を1~5で選んでください");
            String e = scanner.next();

            int num1 = Integer.parseInt(d);
            int num2 = Integer.parseInt(e);

            if(1 == a[num1][num2] && count == 2){
                System.out.println("戦艦を" + bru + "艦撃沈した。残り" +  (3 - bru) + "艦いるぞ");
                count = 0;
                bru++;
                break;

            }else if(1 == a[num1][num2]){
                Ship ship = new Ship();
                ship.seconddisp();
                count++;
                break;

            }else if(1 == a[num1][num2+1]){
                System.out.println(a[num1][num2 + 1]);
                System.out.println("波高し　戦艦はこの列の前にいます");
                p++;

            }else if(1 == a[num1][num2 - 1]){
                System.out.println(a[num1][num2 - 1]);
                System.out.println("波高し　戦艦はこの列の後ろにいます");
                p++;

            }else if(1 == a[num1 + 1][num2]){
                System.out.println(a[num1 + 1][num2]);
                System.out.println("波高し　戦艦はこの前にいます");
                p++;                
            }else if(1 == a[num1 - 1][num2]){
                System.out.println(a[num1 - 1][num2]);
                System.out.pritnln("波高し　戦艦はこの行の後ろにいます");
                p++
            }else{
                System.out.println("敵が周りにいない");
                p++
            }
        }
    }

}