import React from 'react'
import Menubar from './Menubar'
import './About.css'

function About() {
  return (
    <div>
      <Menubar/>
      <div className='about'>
        <div className='about-container'>
              <h1 className='about-name'>About Us!</h1>
              <p style={{fontStyle:'italic'}}>
              "Step into the world of Ebook Empromium, where the boundless realm of literature meets the convenience of the digital age. 
              We pride ourselves on curating an extensive library of ebooks, covering a wide spectrum of genres to satisfy every reading appetite. From thrilling mysteries to heartwarming romances, 
              and from insightful non-fiction to captivating fantasy, our collection caters to diverse tastes. With 24/7 access, you can explore our digital shelves at your leisure and download ebooks for 
              offline reading on your preferred device. Our personalized recommendation system ensures you never run out of intriguing reads, while secure transactions provide a worry-free shopping experience.
               Join our vibrant community of readers, dive into author interviews, and take part in book clubs to enrich your reading journey. Ebook Empromium is your gateway to literary adventures."
              </p>
              <p style={{fontStyle:'italic'}}>
              "At Ebook Promium, we believe in making reading accessible and enjoyable for everyone. Our ebook store is your passport to a world of imagination, education, and entertainment.
              Whether you're a voracious reader or just looking for your next great escape, our vast collection has something for you. Stay up-to-date with the latest literary trends by exploring our bestsellers and new releases.
              Discover the stories behind the books through author profiles and interviews. With secure transactions and multiple download formats, including EPUB, PDF, and Kindle, your reading experience is tailored to your preferences.
              Challenge yourself with reading goals, engage with fellow bookworms, and introduce friends and family to the joy of reading by gifting ebooks. Begin your journey through the digital pages of Ebook Promium and embark on countless adventures in the world of words."
              </p>
        </div>
      </div>

    </div>
  )
}

export default About