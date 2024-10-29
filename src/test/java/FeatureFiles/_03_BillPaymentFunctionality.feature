Feature: ParaBank fatura ödeme işlemlerinin test edilmesi

  Scenario: Kullanıcı fatura ödeme işlemini başarıyla tamamlamalıdır
    Given Kullanıcı ParaBank web sitesine başarıyla giriş yapmıştır
    When Kullanıcı fatura ödeme sayfasına gider
    And Kullanıcı "elektrik" faturasını öder
    Then Ödemenin başarılı bir şekilde tamamlandığı doğrulanmalıdır
    And Hesap bakiyesi güncellenmiş olmalıdır
    And Ödenen faturalar listesi güncellenmiş olmalıdır

  Scenario Outline: Kullanıcı farklı fatura türlerini ödemelidir
    Given Kullanıcı ParaBank web sitesine başarıyla giriş yapmıştır
    When Kullanıcı fatura ödeme sayfasına gider
    And Kullanıcı "<fatura_türü>" faturasını öder
    Then Ödemenin başarılı bir şekilde tamamlandığı doğrulanmalıdır
    And Hesap bakiyesi güncellenmiş olmalıdır
    And Ödenen faturalar listesi güncellenmiş olmalıdır

    Examples:
      | fatura_türü |
      | elektrik    |
      | su          |
      | doğalgaz    |