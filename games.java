import java.util.*;
class games
{
    static int g[][]=new int[15][15];
    int prev;
    void newgame()
    {


    }
    void game()
    {
        Scanner sc=new Scanner(System.in);

        int chk;
        int in,i,j;
         for(i=0;i<15;i++)
        {
            for(j=0;j<15;j++)
            {
                System.out.print(g[i][j]+" ");
            }
            System.out.println();
        }
        do
        {
            System.out.println("Enter color: \n 1:Red \n  2:Blue \n  3:Yellow \n  4: Green \n 5:Purple  \n 6:Black ");
            in=sc.nextInt();
            chk=Ref(in);
        }
        while(chk!=1);
    }
    int Ref(int a)
    {
        prev=g[0][0];
        int flag=1,i=0,j=0,c=0;
        for(i=0;i<15;i++)
        {
            for(j=0;j<15;j++)
            {
                if(g[i][j]==prev)
                {
                     g[i][j]=a;


                }    
                else if(i>0 && j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        flag=1;
        for(i=0;i<15;i++)
        {
            for(j=0;j<15;j++)
            {
                if(g[j][i]==prev)
                {
                     g[j][1]=a;
                     c++;

                }    
                else if(j>0 && i==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        for(i=0;i<15;i++)
        {
            for(j=0;j<15;j++)
            {
                System.out.print(g[i][j]+" ");
            }
            System.out.println();
        }


        if(c>=224)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
       int i,j;
        for(i=0;i<15;i++)
        {
            for(j=0;j<15;j++)
            {
                g[i][j]=(int)(1+(Math.random()*6));

            }
        }

        drain a=new drain();
        a.game();
    }
}