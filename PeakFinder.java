import java.util.Random;

public class PeakFinder {

    /**
     * generate random 2D array
     */
    public int[][] random2dArray(int n, int m){
        int[][] a = new int[n][];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            a[i] = new int[m];
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = r.nextInt(20);
            }
        }
        return a;
        

    }
    public void print2d(int[][] a){
        for (int[] i: a){
            for (int item: i){
                System.out.print(item+"\t ");
            }
            System.out.println("");        
        }
    }
    /**
     * n = number of rows, m = number of columns rowOrcol -> eger 0 ise sadece
     * satirlari(n) bolecek eger 1 ise sadece sutunlari(m) bolecek eger 2 ise bir
     * iterasyonda satirlari, diger iterasyonda sutunlari bolecek (m ve n
     * degerlerinden buyuk olani bolebilirsiniz, bu m ve n degerleri arasaindaki
     * fark fazla oldugunda daha mantikli.)
     */
    public int[] peakRow2D(int[][] a, int r, int c,int x,int y){
        int[] indx = new int[2];
        int startR = x, endR = r, startC = y, endC = c;
        int mid;
            mid = (startR+endR)/2;
            int max = a[mid][startC];
            int imax = 0;
            for(int i = startC; i < endC; i++){
                if(max<a[mid][i]){
                    max = a[mid][i];
                    imax = i;
                }
            } 
            //TODO edges------
            if(mid!=r-1 && a[mid][imax] < a[mid+1][imax]){
                indx[0] = mid+1;
                indx[1] = imax;
            }else if(mid!=0 && a[mid][imax] < a[mid-1][imax]){
                indx[0] = mid-1;
                indx[1] = imax;
            }else {
                indx[0] = mid;
                indx[1] = imax;
            }
        
        return indx;
    }
    public int[] peakCol2D(int[][] a, int r, int c,int x,int y){
        int[] indx = new int[2];
        int startR = x, endR = r, startC = y, endC = c;
        int mid;
            mid = (startC + endC) / 2;
            int max = a[startR][mid];
            int imax = 0;
            for (int i = startR; i < endR; i++) {
                if (max < a[i][mid]) {
                    max = a[i][mid];
                    imax = i;
                }
            }
            // TODO edges------
            if (mid!=c-1 && a[imax][mid] < a[imax][mid + 1]) {
                indx[0] = imax;
                indx[1] = mid+1;
            } else if (mid!=0 && a[imax][mid] < a[imax][mid - 1]) {
                indx[0] = imax;
                indx[1] = mid-1;
            } else {
                indx[0] = imax;
                indx[1] = mid;
            }
            return indx;
        }
        
    

    public int[] peakFinder2D(int[][] a, int n, int m, int rowOrcol) {
        int[] indx = new int[2];
        int startR = 0, endR = n, startC = 0, endC = m;
        int mid;
        if(rowOrcol==0){
            while (startC >= 0 && endC <= n) {
            mid = (startR+endR)/2;
            int max = a[mid][startC];
            int imax = 0;
            for(int i = startC; i < endC; i++){
                if(max<a[mid][i]){
                    max = a[mid][i];
                    imax = i;
                }
            } 
            //TODO edges------
            if(mid!=n-1 && a[mid][imax] < a[mid+1][imax]){
                startR = mid+1; 
            }else if(mid!=0 && a[mid][imax] < a[mid-1][imax]){
                endR = mid-1;
            }else {
                indx[0] = mid;
                indx[1] = imax;
                return indx;
            }
            return indx;
    }
}

         else if (rowOrcol == 1) {
            while (startC >= 0 && endC <= m) {
                mid = (startC + endC) / 2;
                int max = a[startR][mid];
                int imax = 0;
                for (int i = startR; i < endR; i++) {
                    if (max < a[i][mid]) {
                        max = a[i][mid];
                        imax = i;
                    }
                }
                // TODO edges------
                if (mid!=m-1 && a[imax][mid] < a[imax][mid + 1]) {
                    startC = mid + 1;
                } else if (mid!=0 && a[imax][mid] < a[imax][mid - 1]) {
                    endC = mid - 1;
                } else {
                    indx[0] = imax;
                    indx[1] = mid;
                    return indx;
                }
            }

        } else if (rowOrcol == 2) {
            while (startR >= 0 && endR <= n && startC >= 0 && endC <= m) {
                int[] i=new int[2];
                int[] x=new int[2];
                i=peakRow2D(a,endR,endC,startR,startC);
                if((startR+endR)/2<i[0]){
                    startR=i[0];
                    
                }else if((startR+endR)/2>i[0]){
                    endR=i[0];
                }else{
                    return i;
                }
                x=peakCol2D(a,endR,endC,startR,startC);
                
                if((startC+endC)/2<x[1]){
                    startC=i[1];
                    
                }else if((startC+endC)/2>x[1]){
                    endC=i[1];
                }else{
                    return i;
                }
               

            }

            return indx;
        }
        return indx;
    }
       


    /**
     * uc boyutlu arrayde peak bulan method
     * 
     * @param a
     * @param r
     * @param c
     * @param d
     * @return
     */
    public int[][][] random3dArray(int r, int c,int d) {
        int[][][] a = new int[r][c][d];
        Random m = new Random();
        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {
                
                for(int k=0;k<d;k++){
                    
                    a[i][j][k] = m.nextInt(20);
                }
                
            }
        }
        return a;

    }
   
    public void print3d(int[][][] a) {
        for (int[][] i : a) {
            for (int []item : i) {
                System.out.print(item + "\t ");
                for (int n : item) {
                    System.out.print(n + "\t ");
                }
            }
            System.out.println("");
        }
    }

   
     int[] peakFinder3d(int[][][] a, int r, int c, int d) {
        // TODO verilen a'daki peaki bulup return etmesi gerekiyor
        int sR=0, eR=r, sC=0, eC=c, sD=0, eD=d,mid;
        /*sR:başlangıç satır indisini tutar.
         *eR:bitiş satır indisini tutar.
         *sC:başlangıç sütun indisini tutar.
         *eC:bitiş sütun indisini tutar.
         */
        
            mid=(eD+sD)/2;
            int[] index=new int[3];
            int imaxR=0,imaxC=0,imaxD=0;//Her eksenin ayri ayri maksimum indisleri tutulur.
        
        while(sD>=0 && eD<=d){
            mid=(eD+sD)/2;
            int mx=a[sR][sC][mid];
            for(int i=sR;i<eR;i++){
                for(int j=sC;j< eC;j++){
                    if(mx<a[i][j][mid]){
                        mx=a[i][j][mid];
                        imaxR=i;
                        imaxC=j;
                    }
                }
            }
            mx=a[imaxR][imaxC][mid];
            for(int k=sD; k<eD;k++){
            if(mx<a[imaxR][imaxC][mid+1]){
                sD=mid+1;
            }else if(mx<a[imaxR][imaxC][mid-1]){
                eD=mid-1;
            }else{
                imaxD=mid;
                index[0]=imaxR;
                index[1]=imaxC;
                index[2]=imaxD;

        
                return index;

            }
        }


        }
        return index;
        
    }

    public static void main(String[] args) {
        PeakFinder pf = new PeakFinder();
        int n = 6, m = 6, rowOrcol = 1;
        int[][] a = pf.random2dArray(n, m);
        
        long t1 = System.nanoTime();
        pf.peakFinder2D(a, n, m, rowOrcol);
        pf.print2d(a);
        long t2 = System.nanoTime();
        int[] peak = pf.peakFinder2D(a, n, m, rowOrcol);
        /*int d=1;
        *PeakFinder f=new PeakFinder();
        *int[][][] b=f.random3dArray(n,m,d);
        *f.print3d(b);
        *int[] p=f.peakFinder3d(b,n,m,d);
        */
        
        System.out.printf("%d, %d, %d, %d", n, m, rowOrcol, t2 - t1);
        System.out.println("\npeak: "+a[peak[0]][peak[1]]);
        
        //System.out.println(p[0]);
        //System.out.println(p[1]);
        //System.out.println(p[2]);
        /*
         * TODO: int[] peak = pf.peakFinder2D(a, n, m, rowOrcol); is peak correct?
         */
    }
}