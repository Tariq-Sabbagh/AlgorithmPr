public class RectangleChar {
    String[] Rec = {
            "----------------------------------------------------------------------",
            "|A                  |B                  |C                           |",
            "|                   |                   |                            |",
            "|                   |                   |                            |",
            "|                   |                   |                            |",
            "|                   |                   |                            |",
            "|                   |                   |                            |",
            "|                   |                   |                            |",
            "|                   |                   |                            |",
            "|                   |                   |                            |",
            "----------------------------------------------------------------------",
            "|D                            |E                                     |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             ----------------------------------------",
            "|                             |F                                     |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "|                             |                                      |",
            "---------------------------------------------------------------------- "
    };
        void convertStingtochar(String []Rec){
        int maxLength = 0;
        for (String row : Rec) {
        if (row.length() > maxLength) {
            maxLength = row.length();
        }
    }


    char[][] Rec2D = new char[Rec.length][maxLength];


        for (int i = 0; i < Rec.length; i++) {
        Rec2D[i] = Rec[i].toCharArray();
    }}
    public static char[][] flipRectangle(char rectangle [][]) {
        int row=rectangle.length;
        int col=rectangle[0].length;
//        System.out.println(row);
//        System.out.println(col);

        char[][] flipped = new char[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {


                if(rectangle[i][j]=='|'){
                    rectangle[i][j]='-';
                } else if (rectangle[i][j]=='-') {
                    rectangle[i][j]='|';

                }

                flipped[j][row-1-i] =rectangle[i][j];

            }
        }
        flipped[0][0]='-';
        flipped[0][flipped[0].length-1]='-';
        flipped[flipped.length-1][0]='-';
        flipped[flipped.length-1][flipped[0].length-1]='-';

        return flipped;
    }
    void printRectangle(char [][]Rec){
        for (int i = 0; i < Rec.length; i++) {
            for (int j = 0; j < Rec[0].length; j++) {
                System.out.print(Rec[i][j]);
            }
            System.out.println();
        }
    }

    }



