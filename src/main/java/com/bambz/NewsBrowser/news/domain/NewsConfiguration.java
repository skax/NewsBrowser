package com.bambz.NewsBrowser.news.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bambo on 06.03.2018.
 */

@Configuration
class NewsConfiguration {

    @Bean
    NewsFacade newsFacade(ArticleBrowser articleBrowser) {
        return new NewsFacade(isoCountryHelper(), articleBrowser);
    }

    NewsFacade newsFacade() {
        ArticleBrowser articleBrowser = new InMemoryArticleBrowser();
        return new NewsFacade(isoCountryHelper(), articleBrowser);
    }

    private IsoCountryHelper isoCountryHelper() {
        return new IsoCountryHelper();
    }

}
