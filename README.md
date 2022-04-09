
## Dependency Counter Maven Plugin

### Maven nedir
- Bir yazılım projesi oluşturmak tipik olarak; bağımlılıkları indirme, bir sınıf yoluna ek jar'lar yerleştirme, kaynak kodu ikili kodda derleme, testler çalıştırma, derlenmiş kodu JAR, WAR ve ZIP dosyaları gibi yapılara paketleme ve bu yapıları bir uygulama sunucusuna veya deposuna dağıtma gibi görevlerden oluşur. 
- Apache Maven, insanların yazılımı bu şekilde manuel olarak oluştururken ve yönetirken hata yapma riskini en aza indirerek ve kod derleme ve paketleme işini otomatik hale getirir.
- Daha basit bir ifadeyle Maven, Java tabanlı bir projeyi oluşturmak ve yönetmek için kullanılan bir komut satırı aracıdır. 
- XML ile yazılmış merkezi bir bilgi parçası olan Project Object Model (POM) kullanarak Java yazılım projelerini tanımlamak, oluşturmak ve yönetmek için bu güçlü aracı(maven) kullanıyoruz.

### Maven İndirin
- Bu [videodaki](https://toolsqa.com/maven/how-to-install-maven-on-windows/) adımları takip edin
- veya [bu linkten(eng)](https://toolsqa.com/maven/how-to-install-maven-on-windows/), 
[bu linkten(tr)](http://kod5.org/apache-maven-tanitim-ve-kurulum/) okuyarak ilerleyebilirsiniz

### Intellij Idea Kullanarak Bir Maven Projesi Oluşturun
- Bu [videodaki](https://www.youtube.com/watch?v=dxn5DsMWhGY) adımları takip edin

### Plugin Nedir
- Pluginler bir çok eylemin gerçekleştirildiği yerdir
- Pluginler şu amaçlarla kullanılır:
    - jar dosyaları oluşturmak, kod derlemek, birim test kodu, proje belgeleri oluşturmak ve daha fazlası. 
- Bir proje üzerinde gerçekleştirmeyi düşünebileceğiniz hemen hemen her eylem bir Maven plugini olarak uygulanır.
- Maven'deki en basit pluginlerden biri Clean Plugin'dir. 
    - Maven Clean plugini, bir Maven projesinin hedef dizinini kaldırmaktan sorumludur. 
    - "mvn clean" komutunu çalıştırdığınızda, Maven Clean plugininde tanımlandığı gibi "clean" hedefini(goal) yürütür ve hedef dizin kaldırılır. 

### Bu Proje Hakkında
- Bir projenin içerdiği bağımlılıkların sayısını sayar

### Projeyi İndirme ve Çalıştırma
Sırasıyla şu komutları çalıştırın:
```
git clone https://github.com/172-Norma-Java-Spring-Bootcamp/ZeynepSalman-FirstHomework.git
```
Projeyi clone'ladıktan sonra Intellij Idea ortamında açın:

```
mvn install
mvn org.example:counter-maven-plugin:1.0-SNAPSHOT
```
### 
