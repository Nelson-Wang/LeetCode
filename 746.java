    public int minCostClimbingStairs(int[] cost) {
        if (cost.length==0) return 0;
        if (cost.length==1) return cost[0];
        //opt中数据为踩到这个阶梯所使用的最少cost
        int[] opt = new int[cost.length];
        //从第一步开始
        opt[0] = cost[0];
        //从第二步开始
        opt[1] = cost[1];

        for (int i=2; i<cost.length; i++){
            opt[i] = Math.min(opt[i-1]+cost[i], opt[i-2]+cost[i]);
        }
        //返回使用最后一步和不使用最后一步的相对较小那个
        return Math.min(opt[opt.length-1], opt[opt.length-2]);
    }
