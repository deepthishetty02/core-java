class GitBash {
static void openTool() {
      System.out.println("Git Bash opened");
      runCommand("git status");
}
static void runCommand(String cmd) {
     System.out.println("Command: " + cmd);
    int code = getExitCode();
        System.out.println("Exit Code: " + code);
 }
static int getExitCode() {
     return 0;
}

}

