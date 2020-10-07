public class PC {
        cpu CPU;
        cpu CPU_jinchengshu;
        cpu CPU_liyonglv;
        HardDisk HD;
        HardDisk HD_keyong;

        public void setCPU(cpu c) { this.CPU = c; }
        public void setCPU_jinchengshu(cpu d) { this.CPU_jinchengshu = d; }
        public void setCPU_liyonglv(cpu e) {this.CPU_liyonglv = e;}
        public void sethardDisk(HardDisk h) {
            this.HD = h;
        }
        public void setHD_keyong(HardDisk i) {this.HD_keyong = i;};

        public void show() {
            System.out.println("cpu速度:" + CPU.getSpeed());
            System.out.println("cpu进程数:"+ CPU_jinchengshu.jincheng);
            System.out.println("cpu利用率:"+ CPU_liyonglv.liyonglv);
            System.out.println("硬盘容量:" + HD.getAmount());
            System.out.println("硬盘可用容量:" +HD_keyong.keyong);
        }
    }
