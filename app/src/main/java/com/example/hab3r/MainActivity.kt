package com.example.hab3r

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hab3r.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*
        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.gundem -> setContentView(view)
                R.id.siyaset -> replaceFragment(siyaset())
                R.id.spor -> replaceFragment(spor())
                else ->{
                }
            }
            true
        }
        */

        landmarkList = ArrayList<Landmark>()

        val haber1 = Landmark("Kurlarda seçim sonrası başlayan yükseliş bugün de devam ediyor. Dolar/TL 23,40, Euro/TL ise 25.70nin üzerine çıkarak ile yeni tarihi zirvelerini gördü. 28 Mayıstaki Cumhurbaşkanlığı 2. tur seçimlerinden önce dolar 19.96 seviyesindeydi. Bugünkü yükselişle beraber seçim sonrasında dolar/TLde yüzde 17.2lik yükseliş yaşanmış oldu.", R.drawable.dolar)
        val haber2 = Landmark("ECB tarafından bugün yayımlanan karar metninde enflasyonun düşüşte olduğu ancak enflasyon görünümünün uzun süreli çok yüksek olmaya devam ettiği belirtildi. ECB Yönetim Konseyi'nin enflasyonu orta vadeli hedefi olan yüzde 2'ye düşürmekte kararlı olduğu ifade edildi.", R.drawable.ecb)
        val haber3 = Landmark("Euronews'taki habere göre 58 ülkeden 14’ünde konut fiyatlarında reel artış yaşanırken zirvede Türkiye bulunuyor. 43 ülkede reel konut fiyatları düşerken Türkiye’deki yıllık yüzde 51’lik artış dikkat çekiyor. İkinci sıradaki İsrail’de yıllık reel artış yüzde 11.", R.drawable.sehir)
        val haber4 = Landmark("Tüm Otobüsçüler Federasyonu (TOF) Genel Başkanı Mustafa Yıldırım, Kurban Bayramı dolayısıyla satışa sunulan otobüs biletlerinin tükendiğini, ek seferler planlandığını belirterek, \"Bayram tatili boyunca günde ortalama 800 bin yolcu taşınacak, 10 günde yaklaşık 8 milyon insanın taşınacağını öngörüyoruz.\" dedi.K", R.drawable.otogar)
        val haber5 = Landmark("İstanbul Büyükşehir Belediye (İBB) Başkanı Ekrem İmamoğlu'nun 'ihaleye fesat karıştırdığı' gerekçesiyle yargılandığı davanın bir sonraki duruşması 30 Kasım'a ertelendi.", R.drawable.ekrembaskan)
        val haber6 = Landmark("FED’in faiz artırımına ara kararının ardından kripto para piyasalarında geri çekilme yaşandı. Fed kararının hemen öncesinde 26.000 doları gören Bitcoin gece saatlerinde 24.902 dolara geriledi. Bu sabah ise 24.990 dolardan işlem gördü. Dünyanın en büyük kripto parasındaki günlük değer kaybı yüzde 3.8 olurken, Ethereum'da yüzde 5.6'lık düşüş yaşandı.", R.drawable.btc)
        val haber7 = Landmark("Toprak Mahsulleri Ofisi (TMO), ekmek fiyatlarını kontrol altında tutabilmek için un fabrikalarına sürdürdüğü sübvansiyonlu buğday satışını bu aydan itibaren durdurdu. Bu durum, 50 kiloluk un çuvalının devlet destekli 340 TL olan fiyatını 570 TL’ye yükseltti. Bu nedenle ekmek fiyatına yüzde 30-50 zam gelmesi bekleniyor.", R.drawable.ekmek)
        val haber8 = Landmark("“Kırmızı Şeytanlar” olarak bilinen Manchester United’ın hisseleri, kulübün şeyhe yaklaşık 6.3 milyar dolara satıldığına ilişkin haberlerin ardından son 2 ayın en yüksek seviyesini gördü. Katarlı gazete Al-Watan’ın, Al Thani’nin kulübü satın alacağına ilişkin sosyal medya paylaşımı ve sonrasında çıkan haberlerin ardından Manchester United’ın hisseleri yükselişe geçti.", R.drawable.manu)

        landmarkList.add(haber1)
        landmarkList.add(haber2)
        landmarkList.add(haber3)
        landmarkList.add(haber4)
        landmarkList.add(haber5)
        landmarkList.add(haber6)
        landmarkList.add(haber7)
        landmarkList.add(haber8)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }
    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}