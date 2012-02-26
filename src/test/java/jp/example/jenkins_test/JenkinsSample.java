package jp.example.jenkins_test.jenkins;

public class JenkinsSample {

        private String sample;
        private String sample2;
        public String getSample() {
            return sample;
        }
        public void setSample(String sample) {
            this.sample = sample;
        }
        public String getSample2() {
            return sample2;
        }
        public void setSample2(String sample2) {
            this.sample2 = sample2;
        }

        @Override
        public String toString(){
            return sample + sample2;
        }

}
