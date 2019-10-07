import java.util.Scanner;

class NBB {
   private int[] parent;
   private int[] size;

   public NBB(int N) {
      parent = new int[N];
      size = new int[N];
      for (int i = 0; i < N; ++i) {
         parent[i] = i;
         size[i] = 1;
      }
   }

   public int root(int i) {
      while (i != parent[i]) {
         parent[i] = parent[parent[i]];
         i = parent[i];
      }
      return i;
   }

   public void union(int p, int q) {
      int pRoot = root(p);
      int qRoot = root(q);
      if (qRoot == pRoot) return;
      
      if (size[pRoot] < size[qRoot]) {
         parent[pRoot] = qRoot;
         size[qRoot] += size[pRoot];
      } else {
         parent[qRoot] = pRoot;
         size[pRoot] = qRoot;
      }
   }

   public void isConnected(int p, int q) {
      if (root(p) == root(q))
         System.out.println(1);
      else 
         System.out.println(0);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m, n, p;
      m = sc.nextInt();
      n = sc.nextInt();
      p = sc.nextInt();
      
      NBB uf = new NBB(m);
      for (int i = 0; i < n; ++i) {
    	  int a, b;
    	  a = sc.nextInt();
    	  b = sc.nextInt();
    	  uf.union(a, b);
      }
      
      for (int i = 0; i < p; ++i) {
    	  int a, b;
    	  a = sc.nextInt();
    	  b = sc.nextInt();
    	  uf.isConnected(a, b);
      }
   }
}