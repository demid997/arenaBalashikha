document.getElementById('signup-form').addEventListener('submit', function(event) {
    event.preventDefault();

    // Получаем значения из формы
    const name = document.getElementById('name').value;
    const phone = document.getElementById('phone').value;
    const eventSelected = document.getElementById('event').value;

    // Здесь может быть отправка данных на сервер (например, через Firebase или другой бекенд)
    // Для теста просто покажем сообщение
    document.getElementById('response-message').innerHTML = `
        Спасибо за регистрацию, ${name}! Мы свяжемся с вами по номеру ${phone} для подтверждения участия в "${eventSelected}".
    `;

    // Очищаем форму после отправки
    document.getElementById('signup-form').reset();
});
