public class	Main{
	public static void main(String[] args) {
		short mbInKb = 1024;
		int facebookFriends = 150000;
		long starsInUniverse = 15555555555555555L;
		double normalTemp = 36.6;

		byte mbInKbByte=(byte) mbInKb;
		short facebookFriendsShort=(short) facebookFriends;
		int starsInUniverseInt=(int) starsInUniverse;
		long normalTempLong=(long) normalTemp;
		System.out.println (mbInKbByte);
		System.out.println(facebookFriendsShort);
		System.out.println(starsInUniverseInt);
		System.out.println(normalTempLong);
	}
}