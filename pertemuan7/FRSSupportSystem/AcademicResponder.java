import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class AcademicResponder {
    
    private Map<String, String> knowledgeBase;
    
    private Random random;
    private String[] genericResponses;

    public AcademicResponder() {
        knowledgeBase = new HashMap<>();
        random = new Random();
        fillKnowledgeBase();
        fillGenericResponses();
    }

    public String generateResponse(String userInput) {
        String[] words = userInput.toLowerCase().split("\\s+");
        
        for (String w : words) {
            if (knowledgeBase.containsKey(w)) {
                return knowledgeBase.get(w);
            }
        }
        
        return genericResponses[random.nextInt(genericResponses.length)];
    }

    private void fillKnowledgeBase() {
        knowledgeBase.put("sks", "Jumlah SKS maksimum per semester adalah 24 SKS, minimum 18 SKS.");
        knowledgeBase.put("frs", "Pengisian FRS (Formulir Rencana Studi) dibuka pada tanggal 1-5 Agustus. Pastikan sudah konsultasi dengan Dosen Wali.");
        knowledgeBase.put("jadwal", "Jadwal lengkap semua mata kuliah dapat dilihat di portal akademik Anda.");
        knowledgeBase.put("prasyarat", "Prasyarat setiap mata kuliah dapat dicek di buku panduan atau portal akademik.");
        knowledgeBase.put("dosen", "Silakan hubungi Dosen Wali (Doswal) Anda untuk konsultasi rencana studi.");
        knowledgeBase.put("wali", "Silakan hubungi Dosen Wali (Doswal) Anda untuk konsultasi rencana studi.");
        knowledgeBase.put("matakuliah", "Semua mata kuliah dapat dilihat di portal akademik Anda.");
    }

    private void fillGenericResponses() {
        genericResponses = new String[] {
            "Maaf, pertanyaan Anda tidak dikenali.",
            "Untuk info lebih lanjut, silakan hubungi Dosen Wali Anda.",
            "Informasi tersebut dapat ditemukan di Portal Akademik resmi universitas.",
            "Coba gunakan kata kunci lain."
        };
    }
}