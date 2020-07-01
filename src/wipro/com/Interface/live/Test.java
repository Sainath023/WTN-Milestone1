package wipro.com.Interface.live;

import wipro.com.Interface.music.Playable;
import wipro.com.Interface.music.string.Veena;
import wipro.com.Interface.music.wind.Saxophone;

public class Test
{
public static void main(String args[])
{
	Playable a=new Veena();
	Playable b=new Saxophone();
	a.play();
	b.play();
}
}
