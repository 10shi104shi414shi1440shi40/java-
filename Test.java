public class Test {
    public static void main(String args[]) {
        cpu Cpu = new cpu();
        Cpu.setSpeed(2200);
        cpu JCS = new cpu(160);
        cpu LYL = new cpu(0.11);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        HardDisk KY = new HardDisk(100);
        PC pc = new PC();
        pc.setCPU(Cpu);
        pc.setCPU_jinchengshu(JCS);
        pc.setCPU_liyonglv(LYL);
        pc.sethardDisk(disk);
        pc.setHD_keyong(KY);
        pc.show();
    }
}
