class Hello{
    public static void main(String [] args){
       pattern35(5);
    }
    static void pattern35(int n){
        for(int row=1; row<n; row++){
           for(int col=1; col<=row; col++){
            System.out.print(col);
           }
           for(int sp=1; sp<n-row; sp++){
            System.out.print("  ");
           }
           for (int col = row; col >= 1; col--) {
            System.out.print(col);
        }
           System.out.println();
        }
    }
    static void pattern34(int n){
        for(int row=0; row<n; row++){
            char al = (char) ('E' - row);
            for(int col=0; col<n-row; col++){
                System.out.print(al+" ");
                al--;
            }
            System.out.println();
        }
    }

    static void pattern33(int n) {
        char al = 'a';
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if ((col % 2 == 0 && row % 2 == 0) || (col % 2 != 0 && row % 2 != 0)) {
                    System.out.print(al + " ");
                } else {
                    System.out.print(Character.toUpperCase(al) + " ");
                }
                al++;
            }
            System.out.println();
        }
    }
    

    static void pattern25(int n){
        for(int row=0; row<n; row++){
        for(int sp=0; sp<n-row; sp++){
            System.out.print(" ");
        }
        for(int col=0; col<n-1; col++){
            if(col == 0 || col == n-2 || row == 0 || row== n-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           
        }
        System.out.println();
    }
    }
    static void pattern29(int n){
        for(int row=1; row<=n; row++){
           for(int col=0; col<row; col++){
            System.out.print("*");
           }
           for(int sp=0; sp<2*(n-row); sp++){
            System.out.print(" ");
           } 
           for(int col=0; col<row; col++){
                System.out.print("*");
           }
           System.out.println();
        }
        for(int row=1; row<=n; row++){
            for(int col=0; col<n-row; col++){
             System.out.print("*");
            }
            for(int sp=0; sp<2*row; sp++){
             System.out.print(" ");
            } 
            for(int col=0; col<n-row; col++){
                 System.out.print("*");
            }
            System.out.println();
         }
    }





    static void pattern27(int n){
        int num=1;
        for(int row=0; row<n; row++){
             for(int sp=0; sp<row; sp++){
                System.out.print("  ");
             }
            for(int col=1; col<n-row; col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }


    static void pattern28(int n){
        for(int row=0; row<n; row++){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            for(int col=0; col<row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=2; row<=n; row++){
            for(int sp=0; sp<row; sp++){
                System.out.print(" ");
            }
           for(int col=0; col<=n-row; col++){
            System.out.print("* ");
           }
            System.out.println();
        }

    }

    static void pattern26(int n){
        for(int row=1; row<=n; row++){
            for(int col=0; col<=n-row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
        
    }
    static void pattern22(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                if ((row % 2 == 0 && col % 2 == 0) || (row % 2 != 0 && col % 2 != 0)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    static void pattern21(int n){
        int num=1;
        for(int row=1; row<n; row++){
            for(int col=0; col<row; col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        for(int row=0; row<n; row++){
            for(int col=0; col<n-1; col++){
                if(col == 0 || col == n-2 || row == 0 || row == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    

    static void pattern19(int n){
        for(int row=1; row<=n; row++){
           for(int col=0; col<row; col++){
            System.out.print("*");
           }
           for(int sp=0; sp<2*(n-row); sp++){
            System.out.print(" ");
           } 
           for(int col=0; col<row; col++){
                System.out.print("*");
           }
           System.out.println();
        }
        for(int row=1; row<=n; row++){
            for(int col=0; col<n-row; col++){
             System.out.print("*");
            }
            for(int sp=0; sp<2*row; sp++){
             System.out.print(" ");
            } 
            for(int col=0; col<n-row; col++){
                 System.out.print("*");
            }
            System.out.println();
         }
    }


    static void pattern18(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < 2 * row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <=n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < 2 * (n-row); col++) {
                System.out.print(" ");
            }
            for (int col = 0; col<row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for(int row = 0; row<n; row++){
        //     for(int col=0; col<2*n; col++){
        //         if (col < (n - row) || col >= (n + row)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int row = 1; row<n; row++){
        //     for(int col=0; col<2*n; col++){
        //         if (col <= row || col >= (2*n - row-1)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
    
    static void pattern17(int n){
        for(int row=1; row<n; row++){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            for(int col=row; col>0; col--){
                System.out.print(col);
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        for(int row=n; row>0; row--){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            for(int col=row; col>0; col--){
                System.out.print(col);
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        for(int row=0; row<n; row++){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            int num = 1; // First element is always 1
            for (int col = 0; col <= row; col++) {
                System.out.print(num+"  "); // Print Pascal's value
                // Calculate next number using formula: num = num * (row - col) / (col + 1)
                num = num * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
    
    static void pattern15(int n){
        for(int row=1; row<=n; row++){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            for(int col=0; col<2*row-1; col++){
                if(col == 0|| col == 2*row-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int row=n; row>0; row--){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            for(int col=0; col<2*row-1; col++){
                if(col == 0|| col == 2*row-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
    }
    static void pattern14(int n){
        for(int row=n; row>0; row--){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            for(int col=0; col<2*row-1; col++){
                if(col == 0|| col == 2*row-2 || row==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static void pattern13(int n){
        for(int row=1; row<=n; row++){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
            }
            for(int col=0; col<2*row-1; col++){
                if(col == 0|| col == 2*row-2 || row==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
 
    
    
    static void pattern12(int n){
        for(int row=0; row<n; row++){
            for(int sp=0; sp<row; sp++){
                System.out.print(" ");
            }
            for(int col=0; col<n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=0; row<n; row++){
            for(int sp=0; sp<n-row-1; sp++){
                System.out.print(" ");
            }
            for(int col=0; col<row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern11(int n){
        for(int row=0; row<n; row++){
            for(int sp=0; sp<row; sp++){  //  sp = 0  sp<0
                System.out.print(" ");
            }
            for(int col=0; col<n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern10(int n){
        for(int row=0; row<n; row++){
            for(int sp=0; sp<n-row; sp++){
                System.out.print(" ");
               }
            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }       
            System.out.println();
        }

    }

    static void pattern9(int n){
        for(int row=0; row<n; row++){
            for(int s=0; s<row; s++){
                System.out.print(" ");
            }
            for(int col=1; col<2*(n-row); col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row=0; row<n; row++){ 
            for(int space=0; space<n-row; space++){ 
                System.out.print(" ");              
            }
            for(int col=0; col<2*row+1; col++){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }




    static void pattern7(int n){
        for(int row=0; row<n; row++){
            for(int space=0; space<row; space++){
                System.out.print(" ");
            }
            for(int col=n; col>row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    } 


    static void pattern6(int n){
        for(int row=1; row<=n; row++){
           for(int space=1; space<=n-row; space++){
            System.out.print(" ");
           } 
           for(int col=0; col<row; col++){
            System.out.print("*");
           }
           System.out.println();
        }

    } 

    static void pattern5(int n){
        for(int row=0; row<2*n; row++){  
        int res = row>n ? 2*n-row :row;
        for(int col=0; col<res; col++){
            System.out.print("*");
        }
        System.out.println();
     }
    }

    static void pattern4(int n){
       for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
            System.out.print(col+" ");
        }
        System.out.println();
       }
  
      }

    static void pattern3(int n){
      for(int row=0; row<n; row++){    
        for(int col=n; col>row; col--){    
            System.out.print("*");
        }
        System.out.println();
      } 

    }

    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}