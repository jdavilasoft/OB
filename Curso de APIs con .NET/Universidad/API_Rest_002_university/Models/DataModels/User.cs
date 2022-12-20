using System.ComponentModel.DataAnnotations;

namespace API_Rest_002_university.Models.DataModels
{
    public class User: BaseEntity
    {
        [Required, StringLength(50)]
        public string Name { get; set; }
        
        [Required, StringLength(100)]
        public string LastName { get; set; } = string.Empty;
        
        [Required, EmailAddress]
        public string Email { get; set; }

        [Required]
        public string Password { get; set; } = string.Empty;
    }
}
