#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main()
{
    printf("A\n");
    printf("process id: %d\n", getpid());
    printf("parent process id: %d\n", getppid());
    fork();
    printf("B\n");
    printf("parent process id ::%d\n", getppid());

    wait(NULL);
}