PeakFinder
--

PeakFinder, 2D ve 3D dizilerde tepe noktalarını bulmak için kullanılan bir Java programıdır. Program, rastgele 2D ve 3D diziler oluşturur ve bu dizilerde tepe noktalarını tespit eder.
Kullanım

Programı kullanmak için aşağıdaki adımları izleyin:

    -  PeakFinder sınıfını içeren Java dosyasını indirin veya kopyalayın.
    -  Java geliştirme ortamınızda (IDE) dosyayı açın.
    main metodu içinde, 2D veya 3D diziyi oluşturmak için random2dArray veya random3dArray yöntemini kullanabilirsiniz. Bu yöntemlere, oluşturulacak dizinin boyutlarını (satır, sütun, derinlik) ve maksimum rastgele değeri belirleyebilirsiniz.
    -  peakFinder2D veya peakFinder3D yöntemlerini kullanarak tepe noktalarını bulabilirsiniz. Bu yöntemlere, oluşturulan diziyi ve boyutlarını (satır, sütun, derinlik) ve hangi eksende tepe noktasını bulmak istediğinizi belirten bir parametre verebilirsiniz.
    -  Sonuçları print2d veya print3d yöntemleriyle ekrana yazdırabilirsiniz.

Örnek kullanım:
--
  
  PeakFinder pf = new PeakFinder();
  int n = 6, m = 6, rowOrcol = 1;
  int[][] a = pf.random2dArray(n, m);
  
  // 2D diziyi yazdır
  
  pf.print2d(a);
  
  // 2D dizideki tepe noktasını bul
  
  int[] peak = pf.peakFinder2D(a, n, m, rowOrcol);
  System.out.println("Tepe noktası: " + a[peak[0]][peak[1]]);


  
  PeakFinder pf = new PeakFinder();
  int n = 6, m = 6, d = 6;
  int[][][] a = pf.random3dArray(n, m, d);
  
  // 3D diziyi yazdır
  
  pf.print3d(a);
  
  // 3D dizideki tepe noktasını bul
  
  int[] peak = pf.peakFinder3D(a, n, m, d);
  System.out.println("Tepe noktası: " + a[peak[0]][peak[1]][peak[2]]);

Lisans
--

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için LİSANS dosyasını inceleyebilirsiniz.
