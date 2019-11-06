import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Stream;

class Card {
	int Suit;	//花色
	char Number;	//牌数
}

public class CardShow {
	static Card[] OneCard = new Card[52];  // 一副牌，占不带大小鬼
	
	static Card[][] play = new Card[3][17]; // 分三个玩家，一家17张牌
	
	static void showCard(Card[] c) {	// 显示牌
		//int sign = 0;
		String str = "";
		
		for (int i = 0, j = 0; i < c.length; i++, j++) {
			if (j % 13 == 0) {
				System.out.println();
			}
			switch (c[i].Suit) {
				case 1:
				{
					str = "黑桃";
					//sign = 3;
					break;
				}
				case 2:
				{
					str = "红桃";
					//sign = 4;
					break;
				}
				case 3:
				{
					str = "梅花";
					//sign = 5;
					break;
				}
				case 4:
				{
					str = "方块";
					//sign = 6;
					break;
				}
				default:
					break;
			}
			System.out.print("  " + str + c[i].Number);
		}
		System.out.println();
	}
	
	static void initCard() {	// 初始化一副牌
		int suit = 0;
		int temp = 0;
		for (int i = 0; i < 52; i++) {
			if (i % 13 == 0) {
				suit++;
			}
			Card card = new Card();
			card.Suit = suit;
			temp = i % 13;
			switch (temp) {
				case 0:
				{
					card.Number = 'A';
					break;
				}
				case 9:
				{
					card.Number = '0';
					break;
				}
				case 10:
				{
					card.Number = 'J';
					break;
				}
				case 11:
				{
					card.Number = 'Q';
					break;
				}
				case 12:
				{
					card.Number = 'K';
					break;
				}
				default:
				{
					card.Number = (char)(temp + '1');
					break;
				}
			}
			OneCard[i] = card;
		}
	}
	
	static void shuffle() {	// 简单洗牌
		Random r = new Random();
		int j = 0;
		Card tempCard =  new Card();
		for (int i = 0; i < 52; i++) {
			j = r.nextInt(52);
			tempCard = OneCard[j];
			OneCard[j] = OneCard[i];
			OneCard[i] = tempCard;
		}
	}

	static void soha() {	// 简单发牌  玩家1 0~16 玩家2 17~33 玩家3 34~50
		int j = 0, k = 0;
		for (int i = 0; i < 51; i++) {
			k = i % 17;
			play[j][k] = OneCard[i];
			if ( k == 16) {
				j++;
			}
		}
	}
	
	static void sort(Card[] c) { // 简单排序    黑桃-》红桃-》梅花-》方块
		// 效率低下,用一个新的数组间接放置新排序的牌
		Card[]  new_card = new Card[c.length];
		int k = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[j].Suit == i) {
					new_card[k] = c[j];
					k++;
				}
			}
		}
		// end

		// 逐个赋值
		for (int i = 0; i < new_card.length; i++) {
			c[i] = new_card[i];  //能改变形参所指向的内容
		}
		// error 不能改变形参的指向，但能改变形参所指向的内容
		//c = new_card;
		// end
	}
	
	public static void main(String[] args) {
		initCard();	// 初始化一副牌
		System.out.print("一副新牌的初始化列表如下：");
		showCard(OneCard);
		
		shuffle();	// 洗牌
		System.out.print("\n洗牌后的排列如下：");
		showCard(OneCard);
		
		// 发牌给每个玩家
		soha();   
		
		// 排序
		System.out.print("\n发给play1玩家：");
		showCard(play[0]);
		System.out.print("play1玩家排序后：");
		sort(play[0]);  // 排序
		showCard(play[0]);
		
//		System.out.print("\n发给play2玩家：");
//		showCard(play[1]);
//		System.out.print("play2玩家排序后：");
//		sort(play[1]);
//		showCard(play[1]);
//		
//		System.out.print("\n发给play3玩家：");
//		showCard(play[2]);
//		System.out.print("play3玩家排序后：");
//		sort(play[2]);
//		showCard(play[2]);
		// end
	}

	
	/*public static void main(String[] args) {
		//1、组合牌
		//创建Map集合，键：编号     值：牌
		HashMap<Integer,String> pooker = new HashMap<Integer,String>();
		//创建List集合，存储编号
		ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
		//定义13个点数的数组
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		//定义4个花色组合
		String[] colors = {"♠","♣","♥","♦"};
		
		//定义一个整数变量，作为Map的键
		int index = 2;
		//遍历数组，用花色+点数的组合,存储到Map集合中
		for(String number : numbers) {
			for(String color : colors) {
				pooker.put(index, color + number);
				pookerNumber.add(index);
				index++;
			}
		}
		//System.out.println(pooker);
		//System.out.println(pookerNumber);
		
		//单独存储大王和小王
		pooker.put(0, "大王");
		pookerNumber.add(0);
		pooker.put(1, "小王");
		pookerNumber.add(1);
		
		//洗牌，将牌的编号打乱
		Collections.shuffle(pookerNumber);
		//System.out.println(pookerNumber);
		
		//发牌，将牌编号，发给3个玩家集合+1个底牌集合
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> buttom = new ArrayList<Integer>();
		//发牌，采用的是集合的索引%3
		for(int i = 0; i < pookerNumber.size();i++) {
			//现将底牌做好
			if(i<3) {
				//存到底牌去
				buttom.add(pookerNumber.get(i));			
			//对索引%3判断
			}else if(i % 3 == 0) {
				//索引上的编号，发给玩家1
				player1.add(pookerNumber.get(i));
			}else if(i % 3 == 1) {
				//发给玩家2
				player2.add(pookerNumber.get(i));
			}else if(i % 3 == 2) {
				//发给玩家3
				player3.add(pookerNumber.get(i));
			}			
		}
		//对玩家手中的编号进行排序
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		
		//看牌，就是将玩家手中的编号,到Map集合中查找，根据键找值
		//定义实现方法	
		look("包身工  ",player1,pooker);		
		look("清洁工  ",player2,pooker);
		look("洗碗工  ",player3,pooker);
		look("底牌      ",buttom,pooker);
	}
	
	public static void look(String name,ArrayList<Integer> player,HashMap<Integer,String> pooker) {
		//遍历ArrayList集合，获取元素，作为键，到集合Map中找值
		System.out.print(name+" ");
		for(Integer key : player) {
			String value = pooker.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}*/
}
