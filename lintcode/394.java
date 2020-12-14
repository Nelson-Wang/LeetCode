    public boolean firstWillWin(int n){
        boolean[] f = new boolean[n+1];
        f[0] = false;
        f[1] = true;
        for (int i=2; i<n+1; i++){
            if (!f[i-1] || !f[i-2]){
                f[i] = true;
            }
        }
        return f[n];
    }
