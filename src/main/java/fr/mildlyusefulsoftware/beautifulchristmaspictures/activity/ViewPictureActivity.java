package fr.mildlyusefulsoftware.beautifulchristmaspictures.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a150acaa42e372c";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://www.indianlink.com.au/wp-content/uploads/2010/12/christmas-gifts-013.jpg",
				"http://images2.fanpop.com/images/photos/2700000/Christmas-HQ-wallpapers-christmas-2768066-1600-1000.jpg",
				"http://images5.fanpop.com/image/photos/27700000/-Merry-Christmas-christmas-27718945-1024-768.jpg",
				"http://www.jblog.fr/wallpapers/jeux/noel/Christmas-Chalet-Colorado.jpg",
				"http://images5.fanpop.com/image/photos/31500000/xmas-christmas-31584505-1920-1200.jpg",
				"http://jadengail.files.wordpress.com/2011/12/magic-christmas-tale.jpg",
				"http://2.bp.blogspot.com/-uYbbpZVYdm8/TtGAQTlxP6I/AAAAAAAAAp8/IEpzoCwFLmI/s1600/animated-christmas-tree-computer-wallpaper.jpg",
				"https://mymzone.com/blog/wp-content/uploads/2011/12/Merry-Christmas.jpg",
				"http://2.bp.blogspot.com/-3Oe83NkVam4/Tva5K2L2QeI/AAAAAAAAAKQ/xRBZjwJ_QH8/s1600/7art_merry_christmas_screensaver_45560.gif.jpg",
				"http://images.fanpop.com/images/image_uploads/Christmas-Wallpaper-christmas-450016_1600_1200.gif",
				"http://sms.latestsms.in/wp-content/uploads/christmas-wallpaper11.jpg",
				"http://www.imgbase.info/images/safe-wallpapers/miscellaneous/christmas/11806_christmas.jpg",
				"http://sms.latestsms.in/wp-content/uploads/christmas-wallpaper26.jpg",
				"http://blog.doitinparis.fr/wp-content/uploads/2011/12/bigstockphoto_Santa_Reading_Christmas_Wish_L_878150.jpg",
				"http://www.graphics99.com/wp-content/uploads/2012/06/golden-christmas-tree.jpg",
				"http://michourock.m.i.pic.centerblog.net/04wtjsx8.jpg",
				"http://www.wallpaperez.org/wallpaper/holiday/for-Santa-1378.jpg",
				"http://www.wallpaperez.org/wallpaper/holiday/Snowball-Fight-2364.jpg",
				"http://www.wallpaperez.org/wallpaper/holiday/Xmas-1386.jpg",
				"http://3.bp.blogspot.com/_NWF9nNopoV8/TP5LMU5yj5I/AAAAAAAAALU/JBeeHflIX5Y/s1600/Christmas_santa1.jpg",
				"http://santa-kw.com/Images/Santa-dad.jpg",
				"http://www.buncee.com/files/uploads/image/Holidays_New_Year_wallpapers_Santa_Claus_in_a_wagon_019163_.jpg",
				"http://www.turnbacktogod.com/wp-content/uploads/2009/12/Santa-Claus-Pics-0416.jpg",
				"http://www.underscores.fr/images/2010/12/the-santa-clause-saga-photo-01.jpg",
				"http://www.christmashungama.com/wp-content/uploads/2009/12/Santa-Workshop-1.jpg",
				"http://hyattextremechristmas.files.wordpress.com/2009/11/santa-workshop1.jpg",
				"http://images.hellokids.com/_uploads/_tiny_galerie/20091250/christmas-blue-tree-wallpaper-source_amr.jpg",
				"http://www.1280x800wallpaper.com/details/xsick/glass-christmas-tree-1280x800-wallpaper-xsick.jpg",
				"http://www.freechristmaswallpapers.net/images/wallpapers/Santa-Workshop1024-529366.jpeg",
				"http://www.wallpaperhere.com/view/20110704/Santa_s_Workshop_1024x768_santas-workshop2.jpg",
				"http://4.bp.blogspot.com/-gTafgrDKVHQ/Tt6_2tB11NI/AAAAAAAAPn0/E6aY2BtQD-4/s1600/santa%2Bpainting%2Bvintage%2Bimage%2Bgraphicsfairy3.jpg",
				"http://a1128.g.akamai.net/7/1128/497/0001/image.proflowers.com/is/image/ProvideCommerce/PCR12_00000012H15X_0171462_W3_SQ",
				"http://raisetherisk.files.wordpress.com/2011/12/christmas-lights-house.jpg",
				"http://www.austinrealestatehomesblog.com/wp-content/uploads/2010/12/Best-Austin-Neighborhoods-Christmas.jpg",
				"http://images4.fanpop.com/image/photos/17300000/Bright-Christmas-Lights-bright-colors-17363873-1600-1200.jpg",
				"http://gallery.photo.net/photo/129735-md.jpg",
				"http://www.wallpapers10.net/wp-content/uploads/2009/12/Christmas_Lights.jpg",
				"http://images.quickblogcast.com/27389-26018/Trees.JPG",
				"http://3.bp.blogspot.com/_owaN5-zNCMw/R1DtaaFHAjI/AAAAAAAAAKs/pGN6GEf6kVo/s1600-R/Christmas+Lights+048.JPG",
				"http://www.misslopez.se/wp-content/uploads/2011/11/christmas-2.jpg",
				"http://www.busybeecandles.co.uk/wp-content/uploads/2012/10/real-christmas2.jpg",
				"http://whatafy.com/storage//2011/12/2011/12/28/santas-helpers-the-elves/Santas-Helpers-The-Elves.jpg",
				"http://www.fantom-xp.com/wallpapers/22/Santa_Claus_Christmas_eve.jpg",
				"http://www.tripleman.com/images/20081224140241_christmas%20art%20gallery.jpg",
				"http://www.hdwallpapers.in/walls/shining_christmas_day-wide.jpg",
				"http://melastardu13.m.e.pic.centerblog.net/o/e442ed15.jpg",
				"http://www.actinnovation.com/wp-content/uploads/2010/12/Anguille-%C3%A9lectrique-et-sapin-de-No%C3%ABl.jpg",
				"http://yves.marsal.free.fr/atoutgifs/noel/images/y_fond_noel_20.jpg",
				"http://yves.marsal.free.fr/atoutgifs/noel/images/y_fond_noel_50.jpg",
				"http://perso.numericable.fr/gabuzo38/ecrans/chat-noel-1024.jpg",
				"http://www.parchotel.net/uploads/images/boule_de_noel_275.jpg",
				"http://2.bp.blogspot.com/-wRpacT8VYPY/TvI_RUSUIiI/AAAAAAAAIso/YDvjfZDzTxU/s1600/reveillon-noel-id548.jpg",
				"http://1.bp.blogspot.com/-cum9wdLPLio/T7fdKbLLLEI/AAAAAAAAAcM/x2u3gEUmzCA/s1600/70ec8725.jpg",
				"http://yves.marsal.free.fr/atoutgifs/noel/images/y_fond_noel_21.jpg",
				"http://tugaleres.files.wordpress.com/2010/12/p9-106-wallpaper-noel.jpg",
				"http://yves.marsal.free.fr/atoutgifs/noel/images/y_fond_noel_29.jpg",
				"http://www.dinosoria.com/noel-2/images/noel_02_jpg.jpg",
				"http://autumn1608.a.u.pic.centerblog.net/e466b9k1.jpg",
				"http://www.regarderleciel.fr/wp-content/uploads/2011/12/paysage-de-Noel-paysage-de-Noel-sous-la-neige-christmas-snow-wallpaper.jpg",
				//"http://www.logiciel-freeware.net/wallpapers/userpics/10067/noel_33.jpg",
				"http://ninibenpsp.centerblog.net/voir-photo?u=http://ninibenpsp.n.i.pic.centerblog.net/wh8lu8y1.jpg",
				"http://tugaleres.files.wordpress.com/2010/11/fonds-decran-noel.jpg",
				"http://fond-d-ecran-gratuit.org/photos/fond-ecran-chaton-noel.jpg",
				"http://fondsdecrandenoel.com/wp-content/uploads/images/ea/cadeaux-de-noel.jpg"
				
				
				
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("beautifulchristmaspictures",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
