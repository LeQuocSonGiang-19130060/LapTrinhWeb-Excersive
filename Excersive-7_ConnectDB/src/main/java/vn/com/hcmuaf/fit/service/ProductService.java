package vn.com.hcmuaf.fit.service;

import vn.com.hcmuaf.fit.beans.Product;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductService {

    private static ProductService instance;
    Map<String, Product> productMap = new HashMap<>();

    {
        productMap.put("sp1", new Product(1, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 560830, 500000, "https://vn-live-05.slatic.net/p/9dd025228b4c5d81d7791a3ffd32122a.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp2", new Product(2, "Máy hút bụi gia đình công suất 1000W, máy hút bụi cầm tay đa năng với nhiều đầu hút tiện lợi ", 585000, 520000, "https://vn-live-05.slatic.net/p/66813af966a47a56f05a26d77593c10f.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp3", new Product(3, "Máy hút bụi có tay cầm, máy hút bụi gia đình đa năng với nhiều đầu hút và phạm vi làm việc rộng..", 760.830, 670.000, "https://vn-live-05.slatic.net/p/e863f2fc4e4108da4c9c9e55616d1593.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp4", new Product(4, "Robot Hút Bụi Lau Nhà,Robot Lau Nhà, Robot Hút Bụi Lập Trình Dọn Dẹp,", 260830, 190000, "https://vn-live-05.slatic.net/p/16d5cc83601c056913a843d51234a540.png_400x400q90.jpg_.webp"));
        productMap.put("sp5", new Product(5, "MÁY LAU SÀN THÔNG MINH TINECO FLOOR ONE S3 ", 590830, 550000, "https://vn-live-05.slatic.net/p/740056b4f426d5f24c23eb4035850812.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp6", new Product(5, "Máy hút bụi cầm tay siêu lốc xoáy DEERMA ,máy hút bui cầm tay, máy hút bui gia đình", 490830, 350000, "https://vn-live-05.slatic.net/p/5379643dd3222e6e68a902dadef8b6db.png_400x400q90.jpg_.webp"));
        productMap.put("sp7", new Product(5, "Máy Hút Bụi Mini Cầm TayGia May Hut Bui Máy Hút Bụi Cầm Tay 3C...", 790830, 750000, "https://vn-live-05.slatic.net/p/ba4f1b8134b8de6fb035721a4adc7aa3.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp8", new Product(5, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 290830, 200000, "https://vn-live-05.slatic.net/p/ded06798b575e37ab0c78da3dc5ab832.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp9", new Product(5, "Máy Hút Bụi Cầm Tay Baseus Mini A2 5000pa Cho Xe Hơi / Nhà Cửa / Văn Phòng", 370830, 330000, "https://vn-live-05.slatic.net/p/ee1f92031719b165ca2726da151a75c7.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp10", new Product(5, "Máy thổi bụi - hút bụi Thái Lan 700W ETOP XC25 - Mô tơ dây đồng 100%", 590830, 550000, "https://vn-live-05.slatic.net/p/66d6db1625ac3eeeb079cf1a7ad51edb.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp11", new Product(5, "Tủ lạnh Electrolux 85L EUM0900SA", 590830, 550000, "https://salt.tikicdn.com/cache/400x400/ts/product/9c/d6/86/c9db15234a36078637630c1bc5739bb8.jpg.webp"));
        productMap.put("sp12", new Product(5, "Tủ lạnh Samsung Inverter 208 lít RT19M300BGS/SV - Chỉ giao HCM", 7200830, 6500000, "https://salt.tikicdn.com/cache/400x400/ts/product/2e/44/bf/904b37e4b54debbd2bddcf450233612d.jpg.webp"));
        productMap.put("sp13", new Product(5, "Tai nghe Bluetooth AMOI F9 TWS 5.0 bản QUỐC TẾ không dây cảm ứng chống nước IPX5", 260830, 220000, "https://cf.shopee.vn/file/1945c74cbbeefb9b559b338026c0ed0d"));
        productMap.put("sp14", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("sp15", new Product(1, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 560830, 500000, "https://vn-live-05.slatic.net/p/9dd025228b4c5d81d7791a3ffd32122a.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp16", new Product(2, "Máy hút bụi gia đình công suất 1000W, máy hút bụi cầm tay đa năng với nhiều đầu hút tiện lợi ", 585000, 520000, "https://vn-live-05.slatic.net/p/66813af966a47a56f05a26d77593c10f.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp17", new Product(3, "Máy hút bụi có tay cầm, máy hút bụi gia đình đa năng với nhiều đầu hút và phạm vi làm việc rộng..", 760.830, 670.000, "https://vn-live-05.slatic.net/p/e863f2fc4e4108da4c9c9e55616d1593.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp118", new Product(4, "Robot Hút Bụi Lau Nhà,Robot Lau Nhà, Robot Hút Bụi Lập Trình Dọn Dẹp,", 260830, 190000, "https://vn-live-05.slatic.net/p/16d5cc83601c056913a843d51234a540.png_400x400q90.jpg_.webp"));
        productMap.put("s1p19", new Product(5, "MÁY LAU SÀN THÔNG MINH TINECO FLOOR ONE S3 ", 590830, 550000, "https://vn-live-05.slatic.net/p/740056b4f426d5f24c23eb4035850812.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp120", new Product(5, "Máy hút bụi cầm tay siêu lốc xoáy DEERMA ,máy hút bui cầm tay, máy hút bui gia đình", 490830, 350000, "https://vn-live-05.slatic.net/p/5379643dd3222e6e68a902dadef8b6db.png_400x400q90.jpg_.webp"));
        productMap.put("s1p21", new Product(5, "Máy Hút Bụi Mini Cầm TayGia May Hut Bui Máy Hút Bụi Cầm Tay 3C...", 790830, 750000, "https://vn-live-05.slatic.net/p/ba4f1b8134b8de6fb035721a4adc7aa3.jpg_400x400q90.jpg_.webp"));
        productMap.put("s1p22", new Product(5, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 290830, 200000, "https://vn-live-05.slatic.net/p/ded06798b575e37ab0c78da3dc5ab832.jpg_400x400q90.jpg_.webp"));
        productMap.put("s1p23", new Product(5, "Máy Hút Bụi Cầm Tay Baseus Mini A2 5000pa Cho Xe Hơi / Nhà Cửa / Văn Phòng", 370830, 330000, "https://vn-live-05.slatic.net/p/ee1f92031719b165ca2726da151a75c7.jpg_400x400q90.jpg_.webp"));
        productMap.put("s1p24", new Product(5, "Máy thổi bụi - hút bụi Thái Lan 700W ETOP XC25 - Mô tơ dây đồng 100%", 590830, 550000, "https://vn-live-05.slatic.net/p/66d6db1625ac3eeeb079cf1a7ad51edb.jpg_400x400q90.jpg_.webp"));
        productMap.put("s1p25", new Product(5, "Tủ lạnh Electrolux 85L EUM0900SA", 590830, 550000, "https://salt.tikicdn.com/cache/400x400/ts/product/9c/d6/86/c9db15234a36078637630c1bc5739bb8.jpg.webp"));
        productMap.put("1sp26", new Product(5, "Tủ lạnh Samsung Inverter 208 lít RT19M300BGS/SV - Chỉ giao HCM", 7200830, 6500000, "https://salt.tikicdn.com/cache/400x400/ts/product/2e/44/bf/904b37e4b54debbd2bddcf450233612d.jpg.webp"));
        productMap.put("sp27", new Product(5, "Tai nghe Bluetooth AMOI F9 TWS 5.0 bản QUỐC TẾ không dây cảm ứng chống nước IPX5", 260830, 220000, "https://cf.shopee.vn/file/1945c74cbbeefb9b559b338026c0ed0d"));
        productMap.put("s3wp18", new Product(4, "Robot Hút Bụi Lau Nhà,Robot Lau Nhà, Robot Hút Bụi Lập Trình Dọn Dẹp,", 260830, 190000, "https://vn-live-05.slatic.net/p/16d5cc83601c056913a843d51234a540.png_400x400q90.jpg_.webp"));
        productMap.put("sp419", new Product(5, "MÁY LAU SÀN THÔNG MINH TINECO FLOOR ONE S3 ", 590830, 550000, "https://vn-live-05.slatic.net/p/740056b4f426d5f24c23eb4035850812.jpg_400x400q90.jpg_.webp"));
        productMap.put("s4p20", new Product(5, "Máy hút bụi cầm tay siêu lốc xoáy DEERMA ,máy hút bui cầm tay, máy hút bui gia đình", 490830, 350000, "https://vn-live-05.slatic.net/p/5379643dd3222e6e68a902dadef8b6db.png_400x400q90.jpg_.webp"));
        productMap.put("stp21", new Product(5, "Máy Hút Bụi Mini Cầm TayGia May Hut Bui Máy Hút Bụi Cầm Tay 3C...", 790830, 750000, "https://vn-live-05.slatic.net/p/ba4f1b8134b8de6fb035721a4adc7aa3.jpg_400x400q90.jpg_.webp"));
        productMap.put("stdfdp22", new Product(5, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 290830, 200000, "https://vn-live-05.slatic.net/p/ded06798b575e37ab0c78da3dc5ab832.jpg_400x400q90.jpg_.webp"));
        productMap.put("syp23", new Product(5, "Máy Hút Bụi Cầm Tay Baseus Mini A2 5000pa Cho Xe Hơi / Nhà Cửa / Văn Phòng", 370830, 330000, "https://vn-live-05.slatic.net/p/ee1f92031719b165ca2726da151a75c7.jpg_400x400q90.jpg_.webp"));
        productMap.put("sh24", new Product(5, "Máy thổi bụi - hút bụi Thái Lan 700W ETOP XC25 - Mô tơ dây đồng 100%", 590830, 550000, "https://vn-live-05.slatic.net/p/66d6db1625ac3eeeb079cf1a7ad51edb.jpg_400x400q90.jpg_.webp"));
        productMap.put("shgp25", new Product(5, "Tủ lạnh Electrolux 85L EUM0900SA", 590830, 550000, "https://salt.tikicdn.com/cache/400x400/ts/product/9c/d6/86/c9db15234a36078637630c1bc5739bb8.jpg.webp"));
        productMap.put("sgrp26", new Product(5, "Tủ lạnh Samsung Inverter 208 lít RT19M300BGS/SV - Chỉ giao HCM", 7200830, 6500000, "https://salt.tikicdn.com/cache/400x400/ts/product/2e/44/bf/904b37e4b54debbd2bddcf450233612d.jpg.webp"));
        productMap.put("grsp27", new Product(5, "Tai nghe Bluetooth AMOI F9 TWS 5.0 bản QUỐC TẾ không dây cảm ứng chống nước IPX5", 260830, 220000, "https://cf.shopee.vn/file/1945c74cbbeefb9b559b338026c0ed0d"));
        productMap.put("spfdfg28", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("spr29", new Product(5, "Tai nghe Bluetooth AMOI F9 TWS 5.0 bản QUỐC TẾ không dây cảm ứng chống nước IPX5", 260830, 220000, "https://cf.shopee.vn/file/1945c74cbbeefb9b559b338026c0ed0d"));
        productMap.put("sdfdgp", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("egwsp15", new Product(1, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 560830, 500000, "https://vn-live-05.slatic.net/p/9dd025228b4c5d81d7791a3ffd32122a.jpg_400x400q90.jpg_.webp"));
        productMap.put("sepgfdfr16", new Product(2, "Máy hút bụi gia đình công suất 1000W, máy hút bụi cầm tay đa năng với nhiều đầu hút tiện lợi ", 585000, 520000, "https://vn-live-05.slatic.net/p/66813af966a47a56f05a26d77593c10f.jpg_400x400q90.jpg_.webp"));
        productMap.put("sgrep17", new Product(3, "Máy hút bụi có tay cầm, máy hút bụi gia đình đa năng với nhiều đầu hút và phạm vi làm việc rộng..", 760.830, 670.000, "https://vn-live-05.slatic.net/p/e863f2fc4e4108da4c9c9e55616d1593.jpg_400x400q90.jpg_.webp"));
        productMap.put("sgrep18", new Product(4, "Robot Hút Bụi Lau Nhà,Robot Lau Nhà, Robot Hút Bụi Lập Trình Dọn Dẹp,", 260830, 190000, "https://vn-live-05.slatic.net/p/16d5cc83601c056913a843d51234a540.png_400x400q90.jpg_.webp"));
        productMap.put("spygr19", new Product(5, "MÁY LAU SÀN THÔNG MINH TINECO FLOOR ONE S3 ", 590830, 550000, "https://vn-live-05.slatic.net/p/740056b4f426d5f24c23eb4035850812.jpg_400x400q90.jpg_.webp"));
        productMap.put("sfdfdfp28", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("spfdfvf29", new Product(5, "Tai nghe Bluetooth AMOI F9 TWS 5.0 bản QUỐC TẾ không dây cảm ứng chống nước IPX5", 260830, 220000, "https://cf.shopee.vn/file/1945c74cbbeefb9b559b338026c0ed0d"));
        productMap.put("spfdf", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("ewsp15", new Product(1, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 560830, 500000, "https://vn-live-05.slatic.net/p/9dd025228b4c5d81d7791a3ffd32122a.jpg_400x400q90.jpg_.webp"));
        productMap.put("sefvp16", new Product(2, "Máy hút bụi gia đình công suất 1000W, máy hút bụi cầm tay đa năng với nhiều đầu hút tiện lợi ", 585000, 520000, "https://vn-live-05.slatic.net/p/66813af966a47a56f05a26d77593c10f.jpg_400x400q90.jpg_.webp"));
        productMap.put("sepv17", new Product(3, "Máy hút bụi có tay cầm, máy hút bụi gia đình đa năng với nhiều đầu hút và phạm vi làm việc rộng..", 760.830, 670.000, "https://vn-live-05.slatic.net/p/e863f2fc4e4108da4c9c9e55616d1593.jpg_400x400q90.jpg_.webp"));
        productMap.put("svep18", new Product(4, "Robot Hút Bụi Lau Nhà,Robot Lau Nhà, Robot Hút Bụi Lập Trình Dọn Dẹp,", 260830, 190000, "https://vn-live-05.slatic.net/p/16d5cc83601c056913a843d51234a540.png_400x400q90.jpg_.webp"));
        productMap.put("spvfy19", new Product(5, "MÁY LAU SÀN THÔNG MINH TINECO FLOOR ONE S3 ", 590830, 550000, "https://vn-live-05.slatic.net/p/740056b4f426d5f24c23eb4035850812.jpg_400x400q90.jpg_.webp"));
        productMap.put("svp2r0", new Product(5, "Máy hút bụi cầm tay siêu lốc xoáy DEERMA ,máy hút bui cầm tay, máy hút bui gia đình", 490830, 350000, "https://vn-live-05.slatic.net/p/5379643dd3222e6e68a902dadef8b6db.png_400x400q90.jpg_.webp"));
        productMap.put("svfgp21", new Product(5, "Máy Hút Bụi Mini Cầm TayGia May Hut Bui Máy Hút Bụi Cầm Tay 3C...", 790830, 750000, "https://vn-live-05.slatic.net/p/ba4f1b8134b8de6fb035721a4adc7aa3.jpg_400x400q90.jpg_.webp"));
        productMap.put("shgp22", new Product(5, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 290830, 200000, "https://vn-live-05.slatic.net/p/ded06798b575e37ab0c78da3dc5ab832.jpg_400x400q90.jpg_.webp"));
        productMap.put("spvu23", new Product(5, "Máy Hút Bụi Cầm Tay Baseus Mini A2 5000pa Cho Xe Hơi / Nhà Cửa / Văn Phòng", 370830, 330000, "https://vn-live-05.slatic.net/p/ee1f92031719b165ca2726da151a75c7.jpg_400x400q90.jpg_.webp"));
        productMap.put("spry24", new Product(5, "Máy thổi bụi - hút bụi Thái Lan 700W ETOP XC25 - Mô tơ dây đồng 100%", 590830, 550000, "https://vn-live-05.slatic.net/p/66d6db1625ac3eeeb079cf1a7ad51edb.jpg_400x400q90.jpg_.webp"));
        productMap.put("spuy25", new Product(5, "Tủ lạnh Electrolux 85L EUM0900SA", 590830, 550000, "https://salt.tikicdn.com/cache/400x400/ts/product/9c/d6/86/c9db15234a36078637630c1bc5739bb8.jpg.webp"));
        productMap.put("sep14", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("espe15", new Product(1, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 560830, 500000, "https://vn-live-05.slatic.net/p/9dd025228b4c5d81d7791a3ffd32122a.jpg_400x400q90.jpg_.webp"));
        productMap.put("rsp16", new Product(2, "Máy hút bụi gia đình công suất 1000W, máy hút bụi cầm tay đa năng với nhiều đầu hút tiện lợi ", 585000, 520000, "https://vn-live-05.slatic.net/p/66813af966a47a56f05a26d77593c10f.jpg_400x400q90.jpg_.webp"));
        productMap.put("s5p17", new Product(3, "Máy hút bụi có tay cầm, máy hút bụi gia đình đa năng với nhiều đầu hút và phạm vi làm việc rộng..", 760.830, 670.000, "https://vn-live-05.slatic.net/p/e863f2fc4e4108da4c9c9e55616d1593.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp1h8", new Product(4, "Robot Hút Bụi Lau Nhà,Robot Lau Nhà, Robot Hút Bụi Lập Trình Dọn Dẹp,", 260830, 190000, "https://vn-live-05.slatic.net/p/16d5cc83601c056913a843d51234a540.png_400x400q90.jpg_.webp"));
        productMap.put("sp1g9", new Product(5, "MÁY LAU SÀN THÔNG MINH TINECO FLOOR ONE S3 ", 590830, 550000, "https://vn-live-05.slatic.net/p/740056b4f426d5f24c23eb4035850812.jpg_400x400q90.jpg_.webp"));
        productMap.put("sghp20", new Product(5, "Máy hút bụi cầm tay siêu lốc xoáy DEERMA ,máy hút bui cầm tay, máy hút bui gia đình", 490830, 350000, "https://vn-live-05.slatic.net/p/5379643dd3222e6e68a902dadef8b6db.png_400x400q90.jpg_.webp"));
        productMap.put("spaxx21", new Product(5, "Máy Hút Bụi Mini Cầm TayGia May Hut Bui Máy Hút Bụi Cầm Tay 3C...", 790830, 750000, "https://vn-live-05.slatic.net/p/ba4f1b8134b8de6fb035721a4adc7aa3.jpg_400x400q90.jpg_.webp"));
        productMap.put("jbksp22", new Product(5, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 290830, 200000, "https://vn-live-05.slatic.net/p/ded06798b575e37ab0c78da3dc5ab832.jpg_400x400q90.jpg_.webp"));
        productMap.put("bsp23", new Product(5, "Máy Hút Bụi Cầm Tay Baseus Mini A2 5000pa Cho Xe Hơi / Nhà Cửa / Văn Phòng", 370830, 330000, "https://vn-live-05.slatic.net/p/ee1f92031719b165ca2726da151a75c7.jpg_400x400q90.jpg_.webp"));
        productMap.put("sfdbp24", new Product(5, "Máy thổi bụi - hút bụi Thái Lan 700W ETOP XC25 - Mô tơ dây đồng 100%", 590830, 550000, "https://vn-live-05.slatic.net/p/66d6db1625ac3eeeb079cf1a7ad51edb.jpg_400x400q90.jpg_.webp"));
        productMap.put("sp2g5", new Product(5, "Tủ lạnh Electrolux 85L EUM0900SA", 590830, 550000, "https://salt.tikicdn.com/cache/400x400/ts/product/9c/d6/86/c9db15234a36078637630c1bc5739bb8.jpg.webp"));
        productMap.put("sp26ut", new Product(5, "Tủ lạnh Samsung Inverter 208 lít RT19M300BGS/SV - Chỉ giao HCM", 7200830, 6500000, "https://salt.tikicdn.com/cache/400x400/ts/product/2e/44/bf/904b37e4b54debbd2bddcf450233612d.jpg.webp"));
        productMap.put("spg27", new Product(5, "Tai nghe Bluetooth AMOI F9 TWS 5.0 bản QUỐC TẾ không dây cảm ứng chống nước IPX5", 260830, 220000, "https://cf.shopee.vn/file/1945c74cbbeefb9b559b338026c0ed0d"));
        productMap.put("spgr28", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("sprgr29", new Product(5, "Tai nghe Bluetooth AMOI F9 TWS 5.0 bản QUỐC TẾ không dây cảm ứng chống nước IPX5", 260830, 220000, "https://cf.shopee.vn/file/1945c74cbbeefb9b559b338026c0ed0d"));
        productMap.put("splhuu", new Product(5, "ai Nghe Bluetooth 5.0 TWS | Không Dây Cảm Biến Vân Tay, Chất Âm Êm, Trong Trẻm Thời Lương Pin Tốt", 590830, 550000, "https://cf.shopee.vn/file/66219b5e4f77b1d247aafbd14c9c8d79"));
        productMap.put("ewiosp15", new Product(1, "Youpin Máy hút bụi cầm tay gia đình Deerma DX115C 400W", 560830, 500000, "https://vn-live-05.slatic.net/p/9dd025228b4c5d81d7791a3ffd32122a.jpg_400x400q90.jpg_.webp"));

    }

    public static ProductService getInstance() {
        if (instance == null)
            instance = new ProductService();
        return instance;
    }

    private ProductService() {
    }

    public List<Product> getAll() {
        return new LinkedList<>(productMap.values());
    }

}
